package Lesson12;

public class UkrainianBankSystem implements BankSystem {
    @Override
    public void withdraw(User user, int amount) {
        //проверить можно ли снять
        // проверить лимит
        // достаточно ли денег
        //снять деньги

        if(!checkWithdraw(user, amount))
            return;
        user.setBalance(user.getBalance() - amount - amount * user.getBank().getCommission(amount));
    }


    @Override
    public void fund(User user, int amount) {
        if(amount > user.getBank().getLimitOfFunding()){
            System.err.println("Can't fund money " + amount + " to user " + user.toString());
            return;
        }
        user.setBalance(user.getBalance() + amount);
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        // снимаем с fromUser
        // пополняем toUser
        if (fromUser.getBank().getCurrency() != toUser.getBank().getCurrency())
            return;
        if(!checkWithdraw(fromUser, amount))
            return;
        if(amount > toUser.getBank().getLimitOfFunding()){
            System.err.println("Can't fund money " + amount + " to user " + toUser.toString());
            return;
        }
        fromUser.setBalance(fromUser.getBalance() - amount - amount * toUser.getBank().getCommission(amount));
        toUser.setBalance(toUser.getBalance() + amount);
    }

    @Override
    public void paySalary(User user) {
        if(user.getSalary() > user.getBank().getLimitOfFunding())
            return;
        user.setBalance(user.getBalance() + user.getSalary());
    }
    private boolean checkWithdraw(User user, int amount){
        return checkWithdrawLimits(user, amount, user.getBank().getLimitOfWithdrawal()) &&
                checkWithdrawLimits(user, amount, user.getBalance());
    }
    private boolean checkWithdrawLimits(User user, int amount, double limit){
        if(amount + user.getBank().getCommission(amount) > limit){
            printWithdrawalErrorMsg(amount, user);
            return false;
        }
        return true;
    }
    private void printWithdrawalErrorMsg(int amount, User user){
        System.err.println("Can't withdraw money " + amount + " from user " + user.toString());
        System.out.println();
    }

}

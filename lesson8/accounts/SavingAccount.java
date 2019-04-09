package Lesson8.accounts;

public class SavingAccount extends Account {
    int savingPerMonth;


    public SavingAccount(String bankName, String ownerName, int moneyAmount, int savingPerMonth) {
        super(bankName, ownerName, moneyAmount);
        this.savingPerMonth = savingPerMonth;
    }
    @Override
    void changeOwnerName(String newOwnerName){
        if(ownerName == "Jack" || ownerName == "Ann")
            ownerName = newOwnerName;
        else
            System.out.println("Sorry, You can't change owner name of this saving account");
    }

}

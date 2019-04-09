package Lesson12;

public class Main {
    public static void main(String[] args) {
        Bank euBank = new EUBank(1222,"Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank usBank = new USBank(1223,"Sweden", Currency.EUR, 100, 1400, 4, 444343434);
        Bank chinaBank = new ChinaBank(1224,"Sweden", Currency.EUR, 100, 1400, 4, 444343434);

        User user1 = new User(1001, "Denis", 12200, 40, "GMD", 1500, usBank);
        User user2 = new User(1002, "Ann", 2000, 35, "LCD", 1400, euBank);
        User user3 = new User(1003, "Oleg", 20000, 55, "NZD", 2000, usBank);
        User user4 = new User(1004, "Jack", 1000, 65, "CCC", 2100, usBank);
        User user5 = new User(1005, "Ivan", 10000, 70, "lll", 2000, chinaBank);
        User user6 = new User(1006, "Oleg", 20000, 75, "MMM", 2000, chinaBank);


        BankSystem bankSystem = new UkrainianBankSystem();
        bankSystem.withdraw(user1, 150);
        System.out.println(user1.getBalance());
        bankSystem.transferMoney(user3, user5, 500);
        System.out.println(user3.getBalance());
        System.out.println(user5.getBalance());
    }
}

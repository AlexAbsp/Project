package Lesson10.abstractbigexample;

public abstract class Employee {
    private String name;
    private int age;
    private int yearOfExperiens;

    private String carPosition;

   private int salaryPerMonth;
   private BankAccount bankAccount;
   private Company[] companiesWorked = new Company[10];
   private String[] positionsWorked = new String[10];

  abstract void paySalary();
   void changePosition(String newPosition){
       // Сохранить текущую позицию в историю
       // Поменять позицию
       saveCurPositionToHistory();
       carPosition = newPosition;
   }
   private void saveCurPositionToHistory(){
       int index = 0;
       for (String pos : positionsWorked){
           if (pos == null){
               positionsWorked[index] = carPosition;
               break;
           }
           index++;
       }
   }
   int getBalance(){

       return bankAccount.getBalance();
   }

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public String getName() {
        return name;
    }
}

package Lesson5;

import java.util.Arrays;

public class Snaytie {
    public static void main(String[] args) {
        String[] names = {"Jack", "Ann", "Denis","Andrey", "Nikolay", "Irina","John"};
        int[] balances = {100, 500, 8432, -99, 12000, -54, 0};
        //withdraw(names, balances, "Ann", 100);
        //System.out.println(Arrays.toString(balances));
        System.out.println(withdraw(names, balances, "John", 100));
    }

   static int withdraw(String[] clients, int[] balances, String client, int amount){
        int ost;
        //balances[findClitntIndexByName(clients,client)] -= amount;
       if(balances[findClitntIndexByName(clients,client)] < amount)
           ost = -1;
       else
           ost = balances[findClitntIndexByName(clients,client)] -= amount;
       return ost;



   }
    static int findClitntIndexByName(String[] clients, String client)
    {
        int clientIndex = 0;
        for (String cl : clients)
        {
            if(cl == client)
            {
                break;
            }
            clientIndex++;
        }
        return clientIndex;
    }


}

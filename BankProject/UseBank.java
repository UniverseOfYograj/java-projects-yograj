package BankProject;

import java.util.HashMap;
import java.util.Iterator;

public class UseBank {
    public static void main(String[] args) {
        Account obj1=new Account(1001,"Anil",90000.0);
        Account obj2=new Account(1002,"Yograj",100000.0);
        Account obj3=new Account(1003,"Sushma",100000.0);
        Account obj4=new Account(1004,"Arti",150000.0);
        Account obj5=new Account(1005,"Shail",200000.0);

        Bank b1=new Bank();
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj1));
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj2));
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj3));
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj4));
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj4));
        System.out.println("Account Id "+obj1.getAccountId()+" Added:"+b1.addAccount(obj5));
        Account obj=b1.getAccount(1004);
        System.out.println("The account u were looking for:"+obj);

        System.out.println("The account u were looking for:1006:"+b1.getAccount(1006));

        System.out.println("Total no of Accounts is:"+b1.getAccountCount());

        System.out.println("All Accounts in bank b1 is"+b1.getAccounts());

        System.out.println("Account Removed Status:"+b1.removeAccount(1005));

        System.out.println("Now after removing Account the total no of Accounts are:"+b1.getAccountCount());
        System.out.println("Now remaining Account Details are:");
        HashMap<Integer,Account>accounts=b1.getAccounts();

        Iterator it=accounts.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}

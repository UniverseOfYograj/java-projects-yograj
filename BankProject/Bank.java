package BankProject;

import java.util.HashMap;

public class Bank {
    HashMap<Integer,Account>accounts=null;

    public Bank() {
        accounts=new HashMap<>();
    }

    public boolean addAccount(Account obj){
         if(accounts.put(obj.getAccountId(),obj)==null)
             return true;
         else return false;
    }

    public Account getAccount(Integer id){
        return accounts.get(id);
    }

    public boolean removeAccount(Integer id){
        if(accounts.remove(id)!=null)return true;
        else return false;
    }
    public int getAccountCount(){
        return accounts.size();
    }

    public HashMap<Integer, Account> getAccounts() {
        return accounts;
    }
}

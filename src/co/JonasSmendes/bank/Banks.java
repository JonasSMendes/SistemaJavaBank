package co.JonasSmendes.bank;

import java.util.List;
import java.util.ArrayList;

public class Banks {
    private String ag;
    private List<Account> accounts;
    private int LastAccount = 1;


    public Banks(String ag){
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public void insertAccount(Account account){
        accounts.add(account);
    }

    public Account generateAccount(String name, Integer patrimonio){
        Account account = new Account(ag, "" + LastAccount, name, patrimonio);
        LastAccount++;

        return account;
    }
}

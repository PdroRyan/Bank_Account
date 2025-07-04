package co.pedroryan.bank;

import java.util.List;

import java.util.ArrayList;


public class Bank {

    private String ag;

    private List<Account> accounts;

    private int LastAcount = 1;

    public Bank(String ag) {
        this.ag = ag;
        this.accounts = new ArrayList<>();
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void insertAccount(Account account) {
        accounts.add(account);
    }

    public Account generateAccount(String name) {
        Account account = new Account(ag,""+LastAcount,name);
        LastAcount++;
        return account;
    }
    public void outputTotal() {
        double total = 0;
    for (Account account : accounts) {

        double balance = account.getBalance();
        total += balance;
        }
    System.out.println("O Banco possui agora: " + total);
    }


}

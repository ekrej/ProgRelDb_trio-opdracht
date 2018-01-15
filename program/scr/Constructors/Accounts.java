package Constructors;

import Controllers.Account;

import java.util.ArrayList;

public class Accounts {

    ArrayList<Account> accounts;

    public Accounts() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

}

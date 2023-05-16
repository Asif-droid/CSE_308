package bank.emloyee;

import bank.account.account;

public class cashier extends emplyee {
    @Override
    public void change(String type, double r) {
        System.out.println("you don't have the permission");
    }

    @Override
    public void see() {
        System.out.println("you don't have the permission");
    }

    @Override
    public void approval(account ac, int am) {
        System.out.println("you don't have the permission");
    }
}

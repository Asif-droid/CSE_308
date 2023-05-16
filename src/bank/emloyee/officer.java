package bank.emloyee;

import bank.account.account;

public class officer extends emplyee {

    @Override
    public void change(String type, double r) {
        System.out.println("You don't have the permission");
    }

    @Override
    public void see() {
        System.out.println("You don't have the permission");
    }

    public void approval(account ac, int am){
        ///condition to approve
        ac.loanReq(am);
    }
}

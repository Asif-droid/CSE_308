package bank.emloyee;

import bank.account.account;

public abstract class emplyee {

    public void lookup(account ac){
        ac.query();
    }

    public abstract void change(String type,double r);

    public abstract void see();
    public abstract void approval(account ac, int am);

}

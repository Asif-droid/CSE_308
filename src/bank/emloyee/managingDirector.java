package bank.emloyee;

import bank.account.account;
import bank.account.fxAcc;
import bank.account.stAcc;
import bank.account.svAcc;

public class managingDirector extends emplyee {
    @Override
    public void see() {
        int f=bank.bank.getFund();
        System.out.println(f);
    }

    public void change(String type, double r){
        if(type.equalsIgnoreCase("student")){
            stAcc.changeRate(r);
        }
        else if(type.equalsIgnoreCase("saving")){
            svAcc.changeRate(r);
        }
        else if(type.equalsIgnoreCase("fixed")){
            fxAcc.changeRate(r);
        }
    }

    ///see fund

    public void approval(account ac,int am){
        ///condition to approve
        ac.loanReq(am);
    }

}

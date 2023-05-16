package bank.account;

import javax.xml.namespace.QName;

public abstract class account {
    public String name;
    protected int year;
    private int amount;
    private boolean loan;
    private int loanAm=0;
    protected String type;
    protected int rloan;

    public void setRloan(int rloan) {
        this.rloan = rloan;
    }
    public int getRloan(){
        return rloan;
    }

    public String getName(){
        return name;
    }
    public String getType(){
        return type;
    }
    public int getAmount() {
        return amount;
    }
    public void deposit(int x){
        amount+=x;
    };

    public void withDraw(int x){
        if(x>amount){
            System.out.println("invalid amount");
        }
        else{
            System.out.println("withdrawn "+x);
            amount-=x;
        }

    }
    public void createAcc(String name,int x,String t){
        type=t;
        this.name=name;
        year=0;
        amount=x;
        //deposit(x);
        System.out.println("successfully created "+name+"amount"+amount);

    }
    public void interest(double rate){
        amount+=amount*rate;
        year++;
    }
    public int getLoanstatus(){
        return loanAm;
    }
    public void loanReq(int lA){
        loan=true;
        loanAm=lA;
        amount+=loanAm;

    }
    public void loandeduct(){
        amount-=loanAm*.1;
    }
    public void query(){
        System.out.println("amount "+amount);
        if(loanAm>0){
            System.out.println("loan "+loanAm);
        }
    }

}

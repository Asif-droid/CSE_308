package bank.account;

public class svAcc extends account {

    private static double r=.1;

    @Override
    public void createAcc(String name, int x,String t) {
        super.createAcc(name, x,t);
    }
    @Override
    public void deposit(int x) {
        super.deposit(x);
    }

    public static void changeRate(double rate){
        r=rate;
    }
    @Override
    public void withDraw(int x) {
        int examn=getAmount();
        examn-=x;
        if(examn<1000){
            System.out.println("can not withdraw ");
        }
        else{
            super.withDraw(x);
        }


    }
    @Override
    public void loanReq(int lA) {

        if(lA>10000){
            System.out.println("maximum 100000");
        }
        else {
            super.loanReq(lA);
        }

    }
    @Override
    public void loandeduct() {
        super.loandeduct();
    }
    @Override
    public void query() {
        super.query();
    }


    public void increment() {
        super.interest(r);
    }
}

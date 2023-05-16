package bank.account;

public class stAcc extends account {

    private static double r= 0.05;

    @Override
    public void createAcc(String name, int x,String t) {
        System.out.println("created student acc");
        super.createAcc(name, x ,t);
    }

    @Override
    public void deposit(int x) {
        super.deposit(x);
    }

    public static void changeRate(double rate){
        r=rate;
    }
    public void shR(){
        System.out.println("name"+name+"rate"+r);
    }

    @Override
    public void withDraw(int x) {
        int am=getAmount();
        if (x>am){
            System.out.println("Don't have that much money");
        }
        if(x<=10000){
            super.withDraw(x);
        }

        else{
            System.out.println("limit exceeds");
        }


    }


    @Override
    public void loanReq(int lA) {

        if(lA>1000){
            System.out.println("maximum 10000");
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

package bank.account;

public class fxAcc extends account {

    private int maturity;
    private static double r=.15;

    public void setMaturity(int maturity) {
        this.maturity = maturity;
    }

    public static void changeRate(double rate){
        r=rate;
    }
    @Override
    public void createAcc(String name, int x,String t) {
        if(x>=1000000){
            super.createAcc(name, x,t);
        }
        else{
            System.out.println("at least 1000000");
        }

    }

    @Override
    public void deposit(int x) {
        if(x>=50000)
        {
            super.deposit(x);
        }
        else{
            System.out.println("at least 50000");
        }

    }

    @Override
    public void withDraw(int x) {
        if(year>maturity){
            int am=getAmount();
            if(x>am){
                System.out.println("don't have that much money");
            }
            else{
                super.withDraw(x);
            }

        }
        else {
            System.out.println("cannot break before maturity");
        }

    }
    @Override
    public void loanReq(int lA) {

        if(lA>100000){
            System.out.println("maximum 1000000");
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

package bank.account;

public class lnAc extends account {

    @Override
    public void setRloan(int rloan) {
        super.setRloan(rloan);
    }

    @Override
    public int getRloan() {
        return super.getRloan();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void deposit(int x) {
        int am=getAmount();
        if(am>0){
            super.deposit(-x);
        }
        else {
            System.out.println("no loan to pay");
        }

    }

    @Override
    public void withDraw(int x) {
        System.out.println("can not withdraww");
    }

    @Override
    public void createAcc(String name, int x, String t) {

        System.out.println("created loan acc");

        super.createAcc(name, x, t);
    }

    @Override
    public void interest(double rate) {
        super.interest(rate);
    }

    @Override
    public int getLoanstatus() {
        return super.getLoanstatus();
    }

    @Override
    public void loanReq(int lA) {
        super.loanReq(lA);
    }

    @Override
    public void loandeduct() {
        super.loandeduct();
    }

    @Override
    public void query() {
        super.query();
    }
}

package queueMange;

public class optimal extends builder {
    private int q;
    private String comTp;
    private product product;

    public optimal(int q,String comTp){
        this.q=q;
        this.comTp=comTp;
        product=new product();
    }


    @Override
    public void buildDisplay() {
        displayUnit d=new displayUnit("optimal");
        d.makeDisplay();
        product.add(d);

    }

    @Override
    public void buildComUnit() {
        comUnit com=new comUnit(comTp);
        com.make();
        product.add(com);

    }

    @Override
    public void buildControlUnit() {
        controlUnit con=new controlUnit(q,1200);
        product.add(con);

    }

    @Override
    public product getsystem() {
        return product;
    }
}

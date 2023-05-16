package queueMange;

public class poor extends builder {
    private int q;
    private String comTp;
    private product product;

    public poor(int q,String comTp){
        this.q=q;
        this.comTp=comTp;
        product=new product();
    }


    @Override
    public void buildDisplay() {
        displayUnit d=new displayUnit("poor");
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

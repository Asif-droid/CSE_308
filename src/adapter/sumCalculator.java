package adapter;

public class sumCalculator implements sum {
    sumAdapter adapter;


    @Override
    public double sum(String type, String file) {
        double r=0;
        if(type.equalsIgnoreCase("space")){
            spaceSepSum sSum=new spaceSepSum();
            r=sSum.sumSpace(file);

        }
        else{
            adapter=new sumAdapter(type);
            r=adapter.sum(type,file);
        }
        return r;
    }
}

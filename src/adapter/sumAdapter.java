package adapter;

public class sumAdapter implements sum{
    notSepSum notSepSum;
    plusSum pl;
    String  type;
    public sumAdapter(String type){
        if(type.equalsIgnoreCase("not")){
            this.notSepSum=new notSepSum();
        }
        else if(type.equalsIgnoreCase("plus")){
            this.pl=new plusSum();
        }


        this.type=type;
    }
    /*@Override
    public double sum(String file) {
        double r=0;
        if(type.equalsIgnoreCase("space")){
             r=spaceSepSum.sum(file);

        }
        else if(type.equalsIgnoreCase("not")){
             r=notSepSum.notSum(file);

        }
        return r;
    }
*/
    @Override
    public double sum(String type, String file) {
        double r=0;

       if(type.equalsIgnoreCase("not")){
            r=notSepSum.notSum(file);

        }
       else if(type.equalsIgnoreCase("plus")){
           r=pl.plusSum(file);
       }
        return r;
    }
}

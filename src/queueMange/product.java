package queueMange;

import java.util.ArrayList;

public class product {
    private ArrayList<units> parts;
    private int totalPrice;

    public product(){
        this.totalPrice=0;
        parts=new ArrayList<>();
    }

    public void add(units unit){
        parts.add(unit);
    }
    public void show(){
        for (units u:parts){
            u.show();
        }
    }
    public int totalPrice(){
        totalPrice=0;
        for(units u:parts){
            totalPrice+=u.getTotalCost();
        }
        return totalPrice;
    }
}

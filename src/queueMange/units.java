package queueMange;

import java.util.ArrayList;

public abstract class units {
    private int totalCost;

    private ArrayList<tools> toolList=new ArrayList<>();

    public void add(tools tools){
        toolList.add(tools);
    }
    public void show(){

        for(tools t : toolList){
            System.out.println(t.getName()+" "+t.getQnt()+" "+t.getCost());
        }
    }
    public int getTotalCost(){
        totalCost=0;
        for(tools t:toolList){
            totalCost+=t.getCost();
        }
        return totalCost;
    }

}

package queueMange;

import java.util.ArrayList;

public class controlUnit extends units {

    private int noDis;
    private int cost;
    public controlUnit(int noDis,int cost){
        this.cost=(int)(cost+50*noDis*1.5);
        this.noDis=noDis;
    }

    public void setNoDis(int noDis) {
        this.noDis = noDis;
    }

    public int getNoDis() {
        return noDis;
    }

    @Override
    public void show() {
        System.out.println("Control unit :");
        System.out.println("No of display units it controls "+noDis);
        System.out.println("control unit cost: "+cost);
    }

    @Override
    public int getTotalCost() {
        return cost;

        //return (int) (cost+(int)cost*(noDis*.05));
    }
}

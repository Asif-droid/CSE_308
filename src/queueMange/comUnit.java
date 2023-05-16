package queueMange;

public class comUnit extends units{

    private String type;
    private  int yrcost;
    public comUnit(String type){
        this.type=type;
        yrcost=0;

    }



    public void make(){
        if(type.equalsIgnoreCase("wifi")){
            tools module=new tools("wifi module",1,3000);
            yrcost=12000;
            add(module);


        }
        else if(type.equalsIgnoreCase("data")){
            tools module=new tools("sim",1,50);
            yrcost=15000;
            add(module);
        }
    }

    @Override
    public void show() {
        System.out.println("Communication unit :");
        super.show();
        System.out.println("Yearly cost :"+yrcost);
    }

    @Override
    public int getTotalCost() {
        return super.getTotalCost();
    }
}

package queueMange;

public class displayUnit extends units{


    private String type;

    public displayUnit(String type){
        this.type=type;
    }

    public void makeDisplay(){
        tools proc;
        tools dPanel;
        if(type.equalsIgnoreCase("deluxe")){
            proc=new tools("RosberyPi",1,4000);
            dPanel=new tools("LCD ",1,500);
            add(proc);
            add(dPanel);

        }
        else if(type.equalsIgnoreCase("optimal")){
            proc=new tools("ArduinoMega",1,2000);
            dPanel=new tools("LED Matrix ",1,200);
            add(proc);
            add(dPanel);

        }
        else if(type.equalsIgnoreCase("poor")){
            proc=new tools("Atmega32",1,500);
            dPanel=new tools("LED Matrix ",1,200);
            add(proc);
            add(dPanel);

        }

    }

    @Override
    public void add(tools tools) {
        super.add(tools);
    }

    @Override
    public void show() {
        System.out.println("Display Unit: ");
        super.show();
    }

    @Override
    public int getTotalCost() {
        return super.getTotalCost();
    }
}

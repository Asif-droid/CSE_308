package queueMange;

public class sysFac {
    public builder sysBuilder(String type,int num,String com){
        if(type.equalsIgnoreCase("deluxe")){
            return new deluxe(num,com);
        }
        else if(type.equalsIgnoreCase("optimal")){
            return new optimal(num,com);
        }
        else if(type.equalsIgnoreCase("poor")){
            return new poor(num,com);
        }
        return null;

    }
}

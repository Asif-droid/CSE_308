package stockex;

import java.util.LinkedList;

public class stock {
    String id;
    int count;
    double price;
    LinkedList<observer> users;
    stock(String id,int count,double price){
        this.count=count;
        this.id=id;
        this.price=price;
        users=new LinkedList<>();
    }
    public void register(observer o){
        users.add(o);

    }
    public void remove(observer o){
        int ix=users.indexOf(o);
        if(ix>=0){
            users.remove(o);
            System.out.println("removed");
        }
        else{
            System.out.println("not sub");
        }
    }
    public void priceUpdate(double price){
        this.price=price;
        notifyall("Price of "+ id+" has changed to "+price);

    }
    public void countupdate(int count){
        this.count=count;
        notifyall("Count of "+id+" has updated to "+count);
    }
    public void notifyall(String s){
        for(observer o:users){
            o.update(s);
        }

    }
}

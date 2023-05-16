package stockex;

import java.util.LinkedList;

public class user extends observer {
    String id;

    LinkedList<stock> stocks;

    public user(String id){
        this.id=id;
        stocks=new LinkedList<>();
    }

    public void buy(stock s){
        int ix=stocks.indexOf(s);
        if(ix>=0){
            System.out.println("already bought");
            return;
        }
        s.register(this);
        stocks.add(s);
    }
    public void unsub(stock s){
        s.remove(this);
        int ix=stocks.indexOf(s);
        if(ix>=0){
            stocks.remove(s);
            System.out.println("unsub");
        }
        else{
            System.out.println("not bought");
        }
    }


    @Override
    public void update(String s) {
        System.out.println("Id "+id+" Please be informed that:");
        System.out.println(s);
    }
}

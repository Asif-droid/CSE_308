package observer;

import java.util.LinkedList;

public class subject {
    LinkedList<observer> observers;
    int state;
    public subject(){
        observers=new LinkedList<>();
        state=0;
    }
    public int getState(){
        return state;
    }
    public void setState(int state){
        this.state=state;
        notifyall();
    }
    public void add(observer o){
        observers.add(o);
    }
    void notifyall(){
        for (observer o:observers){
            o.update();
        }
    }
}

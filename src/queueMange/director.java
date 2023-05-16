package queueMange;

public class director {
    builder myBuilder;
    public void construct(builder b){
        myBuilder=b;
        myBuilder.buildDisplay();
        myBuilder.buildComUnit();
        myBuilder.buildControlUnit();
        myBuilder.getsystem();
    }
}

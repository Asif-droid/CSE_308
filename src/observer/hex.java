package observer;

public class hex extends observer {



    subject subject;

    public hex(subject subject){
        this.subject=subject;
        this.subject.add(this);
    }
    @Override
    public void update() {
        int state=subject.getState();
        System.out.println(Integer.toHexString(state)+" hexa"+state);
    }
}

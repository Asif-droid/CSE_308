package observer;

public class binary extends observer {

    subject subject;

    public binary(subject subject){
        this.subject=subject;
        this.subject.add(this);
    }


    @Override
    public void update() {
        int state=subject.getState();

        System.out.println(Integer.toBinaryString(state)+" is the binary of "+state);
    }
}

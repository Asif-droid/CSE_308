package observer;

public class main {
    public static void main(String[] args) {
        subject s=new subject();

        new hex(s);
        new binary(s);
        s.setState(10);
    }


}

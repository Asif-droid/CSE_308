package adapter;

public class main {
    public static void main(String[] args) {
        sumCalculator calculator=new sumCalculator();
        double r=calculator.sum("space","src\\adapter\\in.txt");
        double z=calculator.sum("not","src\\adapter\\notsum.txt");
        double x=calculator.sum("plus","src\\adapter\\plus.txt");
        System.out.println(r);
        System.out.println(z);
        System.out.println(x);

    }
}

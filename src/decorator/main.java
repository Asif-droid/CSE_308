package decorator;

public class main {
    public static void main(String[] args) {
        food f1=new frenchFries(new beefBurger(new addExtrachese(new plainBurger())));

        System.out.println(f1.getCost());
        System.out.println(f1.Description());

        food f2=new onionRings(new water(new vegBurger(new plainBurger())));
        System.out.println(f2.getCost());
        System.out.println(f2.Description());

        food f3=new coke(new frenchFries(new vegBurger(new plainBurger())));
        System.out.println(f3.getCost());
        System.out.println(f3.Description());


        food f4=new coffie(new water(new onionRings(new vegBurger(new plainBurger()))));
        System.out.println(f4.getCost());
        System.out.println(f4.Description());

        food f5=new beefBurger(new plainBurger());
        System.out.println(f5.getCost());
        System.out.println(f5.Description());


    }
}

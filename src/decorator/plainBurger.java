package decorator;

public class plainBurger implements  food{

    @Override
    public String Description() {
        //System.out.println("Burger");
        return "Burger, ";
    }

    @Override
    public double getCost() {
        return 10.0;
    }
}

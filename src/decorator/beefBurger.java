package decorator;

public class beefBurger extends burgerDecorator {


    public beefBurger(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
       // System.out.println("Beef");
        return ("Beef "+super.Description());
    }

    @Override
    public double getCost() {
        return super.getCost()+100.0;
    }
}

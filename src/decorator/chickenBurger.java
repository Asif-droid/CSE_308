package decorator;

public class chickenBurger extends burgerDecorator {


    public chickenBurger(decorator.food food) {
        super(food);
    }


    @Override
    public String Description() {
        return " Chicken"+super.Description();
    }

    @Override
    public double getCost() {
        return super.getCost()+120.0;
    }
}

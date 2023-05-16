package decorator;

public class vegBurger extends burgerDecorator {


    public vegBurger(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        return "Veggie "+super.Description();
    }

    @Override
    public double getCost() {
        return super.getCost()+50.0;
    }
}

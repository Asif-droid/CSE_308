package decorator;

public class coffie extends drinksDecorator{
    public coffie(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        return super.Description()+" Coffee, ";
    }

    @Override
    public double getCost() {
        return super.getCost()+15.0;
    }
}

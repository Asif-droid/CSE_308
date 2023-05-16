package decorator;

public class water extends drinksDecorator {
    public water(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        return super.Description()+" Water, ";
    }

    @Override
    public double getCost() {
        return super.getCost()+20.0;
    }
}

package decorator;

public class coke extends drinksDecorator {
    public coke(decorator.food food) {
        super(food);

    }

    @Override
    public String Description() {
        return super.Description()+" Coke, ";
    }

    @Override
    public double getCost() {
        return super.getCost()+20.0;
    }
}

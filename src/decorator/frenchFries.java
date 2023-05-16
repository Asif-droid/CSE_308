package decorator;

public class frenchFries extends apetizerDecorator{
    public frenchFries(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        return super.Description()+" French Fries";
    }

    @Override
    public double getCost() {
        return super.getCost()+75.0;
    }
}

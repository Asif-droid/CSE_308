package decorator;

public class apetizerDecorator implements food {
    private food food;
    public apetizerDecorator(food food){
        this.food=food;
    }
    @Override
    public String Description() {
        return food.Description();
    }

    @Override
    public double getCost() {
        return food.getCost();
    }
}

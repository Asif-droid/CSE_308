package decorator;

public class burgerDecorator implements food {

    private food food;

    public burgerDecorator(food food){
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

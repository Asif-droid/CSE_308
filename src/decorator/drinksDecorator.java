package decorator;

public class drinksDecorator implements food {

    private food food;
    public drinksDecorator(food food){
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

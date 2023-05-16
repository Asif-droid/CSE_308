package decorator;

public class addExtrachese extends burgerDecorator {


    public addExtrachese(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        //System.out.println("cheese");
        return " Extra cheese "+super.Description();
    }

    @Override
    public double getCost() {
        return super.getCost()+50.0;
    }
}

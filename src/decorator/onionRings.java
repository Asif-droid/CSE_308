package decorator;

public class onionRings extends apetizerDecorator {
    public onionRings(decorator.food food) {
        super(food);
    }

    @Override
    public String Description() {
        return super.Description()+" Onion Rings,";
    }

    @Override
    public double getCost() {
        return super.getCost()+50.0;
    }
}

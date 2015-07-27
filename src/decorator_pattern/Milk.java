package decorator_pattern;

/**
 * Created by Ivo.Shurbanovski on 7/27/2015.
 */
public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk ";
    }

    @Override
    public double cost() {
        return 15 + beverage.cost();
    }
}

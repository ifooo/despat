package decorator_pattern;

/**
 * Created by Ivo.Shurbanovski on 7/27/2015.
 */
public class Espresso extends Beverage {
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 50;
    }
}

package decorator_pattern;

/**
 * Created by Ivo.Shurbanovski on 7/27/2015.
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description =  "House Blend Coffee ";
    }
    @Override
    public double cost() {
        return 40;
    }
}

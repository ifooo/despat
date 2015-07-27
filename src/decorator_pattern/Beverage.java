package decorator_pattern;

/**
 * Created by Ivo.Shurbanovski on 7/27/2015.
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}

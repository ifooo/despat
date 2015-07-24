package strategy_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Can't fly.");
    }
}

package strategy_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying");
    }
}

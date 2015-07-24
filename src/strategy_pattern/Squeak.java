package strategy_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}

package strategy_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}

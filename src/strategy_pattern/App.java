package strategy_pattern;

/**
 * Design principle : Identify the aspects of your program that vary and separate them from what stays the same.
 *
 * Design principle : Program to an interface, not an implementation.
 *
 * Design principle : Favor composition over inheritance.
 *
 * definition : The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * Strategy lets the algorithm vary independently from clients that use it.
 */
public class App {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}

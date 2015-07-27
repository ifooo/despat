package decorator_pattern;

/**
 * Design principle : Class should be closed for modification, but open for extension.
 *
 * Definition : The decorator pattern attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 */
public class App {
    public static void main(String[] args) {
        Beverage beverage = new HouseBlend();
        System.out.println(beverage.getDescription() + beverage.cost() + " denari");

        Beverage beverage2 = new Espresso();
        beverage2 = new Milk(beverage2);
        System.out.println(beverage2.getDescription() + beverage2.cost() + " denari");
    }
}

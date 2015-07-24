package observer_pattern;

/**
 * definition : The Observer Pattern defines a one - to - many dependency between objects so that when one object
 * changes state, all of its dependents are notified and updated automatically.
 *
 * Design principle : Strive for loosely coupled
 *
 */
public class App {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(35,80,34.0f);

    }
}

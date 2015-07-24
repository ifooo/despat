package observer_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class CurrentConditionDisplay implements Observer,DisplayElement {
    private float temperature;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current weather ");
        System.out.println("Temperature : " + temperature + " C.");
        System.out.println("Humidity : " + humidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();

    }
}

package observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public class WeatherData implements Subject {
    private List<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);

    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observers){
            o.update(temperature,humidity,pressure);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}

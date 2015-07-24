package observer_pattern;

/**
 * Created by ivo.shurbanovski on 7/24/2015.
 */
public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}

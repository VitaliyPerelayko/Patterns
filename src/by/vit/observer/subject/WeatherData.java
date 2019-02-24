package by.vit.observer.subject;

import by.vit.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;
    private Integer temperature;
    private Integer pressure;
    private Integer humidity;
    private boolean chenged;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public int getTemperature() {
        return temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setNewData(int temp, int pr, int hum) {
        temperature = temp;
        pressure = pr;
        humidity = hum;
        chenged = true;
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.removeIf(observer->observers.contains(o));
    }

    @Override
    public void notifyObserver(Observer o) {
        if (chenged&&observers.contains(o)) {
                o.update(this);
        }
    }

    @Override
    public void notifyObservers() {
        if (chenged&&!observers.isEmpty()) {
            observers.forEach(observer -> observer.update(this));
        }
    }

    @Override
    public void setnNewDataAllObservers() {
        if (chenged&&!observers.isEmpty()){
            observers.forEach(observer ->observer.update(temperature,pressure,humidity));
        }
    }

    @Override
    public void setChanged() {
        chenged = true;
    }
}

package by.vit.observer;

import by.vit.observer.subject.Subject;
import by.vit.observer.subject.WeatherData;

public class CurrentDisplay implements Observer {

    private Subject weatherData;


    public CurrentDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void refuse(){
        weatherData.removeObserver(this);
    }


    @Override
    public void update(Subject subject) {
        if (subject instanceof WeatherData) {
            WeatherData weather = (WeatherData) subject;
            System.out.println(weather.getTemperature());
            System.out.println(weather.getHumidity());
            System.out.println(weather.getPressure());
        }
    }


    @Override
    public void update(Object...args) {
        for (Object o:args) {
            System.out.println(o);
        }
    }
}

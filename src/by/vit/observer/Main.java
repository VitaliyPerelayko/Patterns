package by.vit.observer;

import by.vit.observer.subject.Subject;
import by.vit.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        Subject subject = new WeatherData();
        Observer observer = new CurrentDisplay(subject);
        ((WeatherData) subject).setNewData(5,6,7);
        subject.notifyObservers();
        subject.setnNewDataAllObservers();
        ((CurrentDisplay) observer).refuse();
        subject.notifyObservers();
    }
}

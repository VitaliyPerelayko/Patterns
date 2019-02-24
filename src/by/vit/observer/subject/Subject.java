package by.vit.observer.subject;

import by.vit.observer.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver(Observer o);
    void notifyObservers();
    void setnNewDataAllObservers();
    void setChanged();
}

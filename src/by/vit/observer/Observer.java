package by.vit.observer;

import by.vit.observer.subject.Subject;

public interface Observer {
    void update(Subject subject);
    void update(Object...arg);

}

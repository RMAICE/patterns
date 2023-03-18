package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observerable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update();
    }
}

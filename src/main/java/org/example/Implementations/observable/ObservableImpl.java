package org.example.Implementations.observable;

import org.example.obs.Observable;
import org.example.obs.Observer;

import java.util.ArrayList;

public class ObservableImpl implements Observable {


    private ArrayList<Observer> observers = new ArrayList<>();
    private int state;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (Observer observer : observers) {
            observer.update(state);

        }

    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
        notifyObservers();
    }
}

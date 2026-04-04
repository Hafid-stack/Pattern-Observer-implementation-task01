package org.example.Implementations.observable;

import org.example.obs.Observable;
import org.example.obs.Observer;
import org.example.obs.ObserverPull;

import java.util.ArrayList;

public class ObservablePullImpl implements Observable {


    private ArrayList<ObserverPull> observers = new ArrayList<>();
    private int state;
    @Override
    public void addObserver(ObserverPull observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverPull observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for (ObserverPull observer : observers) {
            observer.update(this);

        }

    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}

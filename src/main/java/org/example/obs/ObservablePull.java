package org.example.obs;

public interface ObservablePull {


    void addObserver(ObserverPull observer);
    void removeObserver(ObserverPull observer);
    void notifyObservers();
    int getState();
}

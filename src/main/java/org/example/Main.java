package org.example;

import org.example.Implementations.observable.ObservableImpl;
import org.example.Implementations.observers.ObserverImplOne;
import org.example.obs.Observable;
import org.example.obs.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Observable observable = new ObservableImpl();
        Observer observer1 = new ObserverImplOne();
        Observer observer2 = new ObserverImplOne();

        observable.addObserver(observer1);
        observable.addObserver(observer2);
        observable.notifyObservers();
        observer1.update(40);
        observer2.update(60);






    }
}
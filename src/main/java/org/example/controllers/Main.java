package org.example.controllers;

import org.example.Implementations.observable.ObservableImpl;
import org.example.Implementations.observers.ObserverImplOne;
import org.example.Implementations.observers.ObserverImplTwo;
import org.example.obs.Observer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        Observer observer1 = new ObserverImplOne();
        Observer observer2 = new ObserverImplTwo();

        observable.addObserver(observer1);
        observable.addObserver(observer2);



        observable.setState(10);
       observable.setState(10);
        observable.setState(10);






    }
}
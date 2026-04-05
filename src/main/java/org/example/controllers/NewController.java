package org.example.controllers;

import org.example.Implementations.observable.ObservableImpl;
import org.example.Implementations.observable.ObservablePullImpl;
import org.example.Implementations.observers.ObserverImplOne;
import org.example.Implementations.observerspull.ObserverPullImplOne;
import org.example.obs.ObservablePull;
import org.example.obs.ObserverPull;

public class NewController {

    public static void main(String[] args) {

        ObservablePullImpl observable = new ObservablePullImpl();
        ObserverPull observerPull1=new ObserverPullImplOne();
        ObserverPull observerPull2=new ObserverPullImplOne();

        observable.addObserver(observerPull1);
        observable.addObserver(observerPull2);
        observable.notifyObservers();
        observable.setState(10);
        observable.setState(10);


    }
}

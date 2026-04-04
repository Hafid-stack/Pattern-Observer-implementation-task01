package org.example.controllers;

import org.example.Implementations.observable.ObservableImpl;
import org.example.Implementations.observers.ObserverImplOne;
import org.example.Implementations.observerspull.ObserverPullImplOne;
import org.example.obs.ObserverPull;

public class NewController {

    public static void main(String[] args) {

        ObservableImpl observable = new ObservableImpl();
        ObserverPull observerPull1=new ObserverPullImplOne();
        ObserverPull observerPull2=new ObserverPullImplOne();


        observable.
    }
}

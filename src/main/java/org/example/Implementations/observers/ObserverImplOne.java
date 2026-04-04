package org.example.Implementations.observers;

import org.example.obs.Observer;

public class ObserverImplOne implements Observer {




    @Override
    public void update(int newValue) {

        System.out.println("ObserverImplOne update");
        System.out.println("New value: " + newValue);
        System.out.println("***********************");

    }
}

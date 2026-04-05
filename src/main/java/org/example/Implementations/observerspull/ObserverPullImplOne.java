package org.example.Implementations.observerspull;

import org.example.obs.ObservablePull;
import org.example.obs.ObserverPull;

public class ObserverPullImplOne implements ObserverPull {

    @Override
    public void update(ObservablePull observable) {

        System.out.println("ObserverPullImplOne update");
        System.out.println(observable.getState());

    }
}
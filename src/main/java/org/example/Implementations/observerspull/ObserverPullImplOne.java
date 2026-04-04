package org.example.Implementations.observerspull;

import org.example.Implementations.observable.ObservableImpl;
import org.example.obs.Observable;
import org.example.obs.ObserverPull;

public class ObserverPullImplOne implements ObserverPull {



    @Override
    public void update(Observable o) {

        System.out.println("ObserverPullImplOne update");

        System.out.println(((ObservableImpl)o).getState());
    }
}

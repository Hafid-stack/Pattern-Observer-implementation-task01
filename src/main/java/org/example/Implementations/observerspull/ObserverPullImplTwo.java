package org.example.Implementations.observerspull;

import org.example.obs.ObservablePull;
import org.example.obs.ObserverPull;

import java.util.ArrayList;

public class ObserverPullImplTwo implements ObserverPull {

    ArrayList<Integer> newValueHistory = new ArrayList<>();

    @Override
    public void update(ObservablePull observable) {

        int value = observable.getState();
        newValueHistory.add(value);

        System.out.println("ObserverPullImplTwo update");

        int totalValue = 0;
        for (Integer v : newValueHistory) {
            totalValue += v;
        }

        System.out.println("Total value is " + totalValue);
    }
}
package org.example.Implementations.observerspull;

import org.example.Implementations.observable.ObservableImpl;
import org.example.obs.Observable;
import org.example.obs.ObserverPull;

import java.util.ArrayList;

public class ObserverPullImplTwo implements ObserverPull {
    ArrayList<Integer> newValueHistory = new ArrayList<>();


    @Override
    public void update(Observable o) {
            newValueHistory.add(((ObservableImpl)o).getState());
        System.out.println("ObserverPullImplTwo update");
        int totalValue = 0;
        for (Integer value : newValueHistory) {
            totalValue += value;
        }
        System.out.println("Total value is " + totalValue);
    }
}
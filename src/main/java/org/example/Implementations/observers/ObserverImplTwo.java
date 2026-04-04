package org.example.Implementations.observers;

import org.example.obs.Observer;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ObserverImplTwo implements Observer {


    ArrayList<Integer> newValueHistory = new ArrayList<>();
    private int finalValue;
    @Override
    public void update(int newValue) {

        System.out.println("ObserverImplTwo update");
        newValueHistory.add(newValue);
        for (int i = 0; i < newValueHistory.size(); i++) {
                    finalValue=+newValueHistory.get(i);
        }
        System.out.println("New value: " +finalValue );
        System.out.println("***********************");

    }
}

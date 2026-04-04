package org.example.Implementations.observers;

import org.example.obs.Observer;


import java.util.ArrayList;

public class ObserverImplTwo implements Observer {
    ArrayList<Integer> newValueHistory = new ArrayList<>();

    @Override
    public void update(int newValue) {
        int totalValue=0;

        System.out.println("****2****\n");
        newValueHistory.add(newValue);
        for(int i = 0; i < newValueHistory.size(); i++){

            totalValue=totalValue+newValueHistory.get(i);
            System.out.println("size inside the for loop"+newValueHistory.size());
        }
        System.out.println("\n" +totalValue);
    }
}
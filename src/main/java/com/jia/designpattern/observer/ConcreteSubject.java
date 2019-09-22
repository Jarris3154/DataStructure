package com.jia.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hp
 */
public class ConcreteSubject implements Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String str) {
        for (Observer observer : observers) {
            observer.update(str);
        }
    }
}

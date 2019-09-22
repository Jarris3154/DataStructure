package com.jia.designpattern.observer;

/**
 * @author hp
 */
public class ConcreteObserver implements Observer {

    private String observerStr;

    @Override
    public void update(String str) {
        observerStr = str;
        System.out.println("观察者的状态为： " + observerStr);
    }
}

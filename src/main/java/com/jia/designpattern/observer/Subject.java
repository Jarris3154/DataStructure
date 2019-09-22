package com.jia.designpattern.observer;

/**
 * @author hp
 */
public interface Subject {

    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);

    public void notifyObserver(String str);
}

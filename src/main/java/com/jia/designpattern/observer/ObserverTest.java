package com.jia.designpattern.observer;

/**
 * @author hp
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer ob1 = new ConcreteObserver();
        Observer ob2 = new ConcreteObserver();

        subject.addObserver(ob1);
        subject.addObserver(ob2);
        subject.notifyObserver("开始观察");
    }
}

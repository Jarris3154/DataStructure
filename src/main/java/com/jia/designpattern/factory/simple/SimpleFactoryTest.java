package com.jia.designpattern.factory.simple;

import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        Fruit fruit = null;

        fruit = FruitSimpleFactory.createFruit("apple");
        fruit.operateFruit();

        fruit = FruitSimpleFactory.createFruit("banana");
        fruit.operateFruit();
    }
}

package com.jia.designpattern.factory.factorymethod;

import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        FruitFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.createFruit();
        apple.operateFruit();

        FruitFactory bananaFactory = new BananaFactory();
        Fruit banana = bananaFactory.createFruit();
        banana.operateFruit();
    }
}

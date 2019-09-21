package com.jia.designpattern.factory.factorymethod;

import com.jia.designpattern.factory.model.Apple;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class AppleFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}

package com.jia.designpattern.factory.factorymethod;

import com.jia.designpattern.factory.model.Banana;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class BananaFactory extends FruitFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }
}

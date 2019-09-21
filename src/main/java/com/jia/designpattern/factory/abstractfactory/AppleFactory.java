package com.jia.designpattern.factory.abstractfactory;

import com.jia.designpattern.factory.model.Apple;
import com.jia.designpattern.factory.model.DriedApple;
import com.jia.designpattern.factory.model.DriedFruit;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class AppleFactory extends AbstractFruitFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }

    @Override
    public DriedFruit createDriedFruit() {
        return new DriedApple();
    }
}

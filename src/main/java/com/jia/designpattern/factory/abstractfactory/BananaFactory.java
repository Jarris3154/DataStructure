package com.jia.designpattern.factory.abstractfactory;

import com.jia.designpattern.factory.model.Banana;
import com.jia.designpattern.factory.model.DriedBanana;
import com.jia.designpattern.factory.model.DriedFruit;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class BananaFactory extends AbstractFruitFactory {
    @Override
    public Fruit createFruit() {
        return new Banana();
    }

    @Override
    public DriedFruit createDriedFruit() {
        return new DriedBanana();
    }
}

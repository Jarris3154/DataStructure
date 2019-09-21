package com.jia.designpattern.factory.abstractfactory;

import com.jia.designpattern.factory.model.DriedFruit;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public abstract class AbstractFruitFactory {

    public abstract Fruit createFruit();

    public abstract DriedFruit createDriedFruit();
}

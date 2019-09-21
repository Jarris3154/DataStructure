package com.jia.designpattern.factory.abstractfactory;

import com.jia.designpattern.factory.model.DriedFruit;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        AbstractFruitFactory fruitFactory = new AppleFactory();

        Fruit apple = fruitFactory.createFruit();
        apple.operateFruit();
        DriedFruit driedApple = fruitFactory.createDriedFruit();
        driedApple.operateProduct();

        AbstractFruitFactory bananaFactory = new BananaFactory();

        Fruit banana = bananaFactory.createFruit();
        banana.operateFruit();
        DriedFruit driedBanana = bananaFactory.createDriedFruit();
        driedBanana.operateProduct();
    }
}

package com.jia.designpattern.factory.simple;

import com.jia.designpattern.factory.model.Apple;
import com.jia.designpattern.factory.model.Banana;
import com.jia.designpattern.factory.model.Fruit;

/**
 * @author Jarris
 */
public class FruitSimpleFactory {

    public static Fruit createFruit(String type){
        Fruit fruit = null;

        if("banana".equalsIgnoreCase(type)){
           fruit = new Banana();
        }else if ("apple".equalsIgnoreCase(type)){
            fruit = new Apple();
        }

        return fruit;
    }
}

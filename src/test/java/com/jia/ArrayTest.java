package com.jia;

import com.jia.dataStructure.Array;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Jarris
 */
public class ArrayTest {

    @Test
    public void testToString(){
        Array<Integer> array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }
        System.out.println(array);

        array.add(1, 100);
        assertEquals(11, array.getSize());
        assertEquals(new Integer(100), array.get(1));

        array.addFirst(-1);
        assertEquals(12, array.getSize());
        assertEquals(new Integer(-1), array.get(0));
    }

    @Test
    public void testRemove(){
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }

        array.remove(3);
        assertEquals(9, array.getSize());
        assertEquals(4, array.get(3));

        array.removeLast();
        assertEquals(8, array.getSize());
        assertEquals(8, array.get(array.getSize()-1));
    }

    @Test
    public void testElement(){
        Array array = new Array(20);
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }

        array.removeElement(3);
        assertEquals(9, array.getSize());
        assertEquals(4, array.get(3));
    }


    @Test
    public void testResize(){
        Array<Integer> array = new Array();
        for (int i = 0; i < 10; i++) {
            array.addLast(i);
        }

        array.add(1, 100);

        assertEquals(20, array.getCapacity());
        assertEquals(11, array.getSize());

        array.removeLast();
        assertEquals(10, array.getSize());
        assertEquals(10, array.getCapacity());
    }
}
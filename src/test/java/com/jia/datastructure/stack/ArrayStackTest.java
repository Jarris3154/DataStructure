package com.jia.datastructure.stack;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Jarris
 */
public class ArrayStackTest {

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void test() {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }

        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack.peek());
    }
}
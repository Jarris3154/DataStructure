package com.jia.dataStructure.linkedlist;

import org.junit.Test;

/**
 * @author Jarris
 */
public class LinkedListStackTest {

    @Test
    public void test() {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
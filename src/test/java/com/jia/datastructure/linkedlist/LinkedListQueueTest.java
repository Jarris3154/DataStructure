package com.jia.datastructure.linkedlist;

import org.junit.Test;

/**
 * @author Jarris
 */
public class LinkedListQueueTest {

    @Test
    public void test() {
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
            System.out.println(queue);
        }
        queue.dequeue();
        System.out.println(queue);
    }
}
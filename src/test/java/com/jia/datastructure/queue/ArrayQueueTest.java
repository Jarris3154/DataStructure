package com.jia.datastructure.queue;

import org.junit.Test;

/**
 * @author Jarris
 */
public class ArrayQueueTest {

    @Test
    public void test() {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
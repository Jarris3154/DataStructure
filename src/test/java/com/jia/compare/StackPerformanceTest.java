package com.jia.compare;

import com.jia.dataStructure.linkedlist.LinkedListStack;
import com.jia.dataStructure.stack.ArrayStack;
import com.jia.dataStructure.stack.Stack;
import org.junit.Test;

import java.util.Random;

/**
 * @author Jarris
 */
public class StackPerformanceTest {

    @Test
    public void test() {

        int opCount = 10000000;

        ArrayStack<Integer> arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack, opCount);

        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack, opCount);

        System.out.println(time1);
        System.out.println(time2);
    }

    private double testStack(Stack<Integer> stack, int opCount) {
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0; i < opCount; i++) {
            stack.push(random.nextInt(Integer.MAX_VALUE));
        }

        for (int i = 0; i < opCount; i++) {
            stack.pop();
        }

        long endTime = System.nanoTime();
        return (endTime - startTime) / 1000000000.0;
    }
}

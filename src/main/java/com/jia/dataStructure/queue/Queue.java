package com.jia.dataStructure.queue;

/**
 * @author Jarris
 */
public interface Queue<E> {
    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}

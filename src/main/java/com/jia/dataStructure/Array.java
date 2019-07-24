package com.jia.dataStructure;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Jarris
 */
@Getter
@Setter
public class Array<E> {
    private E[] data;
    private int size;

    /**
     * @param capacity
     */
    public Array(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * Constructor with default size 10;
     */
    public Array() {
        this(10);
    }

    /**
     * @return capacity of the array
     */
    public int getCapacity() {
        return data.length;
    }

    /**
     * @return boolean result whether the array is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * add a new element before all elements
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * add a new element after all elements.
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * add element into the specific index of the array.
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Add failed, require index >= 0 and index <= size");
        }

        if (size == data.length) {
            resize(2 * data.length);
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }

        data[index] = e;
        size++;
    }

    /**
     * @param index
     * @return
     */
    public E remove(int index) {

        if (index < 0 || index > size) {
            throw new IllegalArgumentException("Remove failed, require index >= 0 and index <= size");
        }

        E ret = data[index];

        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;

        if (size == data.length / 4 && data.length / 2 != 0) {
            resize(data.length / 2);
        }
        return ret;
    }

    /**
     * resize if capacity is not enough or too much
     *
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    /**
     * remove the first element
     *
     * @return the first element
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * remove the last element
     *
     * @return the last element
     */
    public E removeLast() {
        return remove(size - 1);
    }

    /**
     * remove the specific element int the array
     *
     * @param e
     */
    public void removeElement(E e) {
        int index = find(e);
        if (index != -1) {
            remove(index);
        }
    }


    /**
     * get first element at index's location
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * get last element at index's location
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * get element at index's location
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed, Index is illegal");
        }
        return data[index];
    }

    /**
     * set the element into the specific index of the array.
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("Get failed, Index is illegal");
        }
        data[index] = e;
    }

    /**
     * if the array contains e;
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    /**
     * find the index of specific element of array
     *
     * @param e
     * @return
     */
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Array: size = %d, capacity = %d\n", size, data.length));
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(data[i]);
            if (i != size - 1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

}

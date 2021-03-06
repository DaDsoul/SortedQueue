package com.akezhanmussa.adt;

public interface SortedQueue<T extends Comparable> {
    /**
     * Adds an element to the specific order.
     *
     * @param value element to be added to the specific order
     */
    public void insert(T value);

    /**
     * Removes and returns the front most element of the queue
     *
     * @return the front most element of the queue
     * @throws Exception if the queue is empty
     */
    public T dequeue() throws Exception;

    /**
     * @return the size of the queue
     */
    public int getSize();

    /**
     * Removes all elements from the queue
     */
    public void clear();

    /**
     * @return a String representation of the queue
     */
    @Override
    public String toString();


}

package com.akezhanmussa.impl;

import com.akezhanmussa.adt.SortedQueue;

public class LinkedListSortedQueue<T extends Comparable> implements SortedQueue<T>{


    Node<T> front;
    int size;

    public LinkedListSortedQueue(){
        front = null;
        size = 0;
    }

    @Override
    public void insert(T value) {

        Node<T> newNode = new Node(value);

        boolean checker = false;

        if (size == 0){
            front = newNode;
            front.setLink(null);
        } else {
            Node<T> nextItem = front.getLink();
            Node<T> previousItem = front;

            if (value.compareTo(front.getValue()) <= 0){
                newNode.setLink(front);
                front = newNode;
            } else if (value.compareTo(front.getValue()) > 0){
                if (size == 1){
                    front.setLink(newNode);
                    newNode.setLink(null);
                } else {
                    for(int i = 2; i <= size; i++){
                        if (value.compareTo(nextItem.getValue()) > 0){
                            checker = true;
                        } else {
                            previousItem.setLink(newNode);
                            newNode.setLink(nextItem);
                            checker = false;
                            break;
                        }

                        previousItem = previousItem.getLink();
                        nextItem = nextItem.getLink();
                    }
                }
            }

            if (checker){
                Node<T> timeTope = front;
                for (int i = 1 ; i<size; i++){
                    timeTope = timeTope.getLink();
                }
                timeTope.setLink(newNode);
                newNode.setLink(null);
            }
        }

        size ++;
    }

    @Override
    public T dequeue() throws Exception {
        if (size == 0){
            throw new Exception("Queue is empty!!!");
        }

        Node<T> oldFront = front;
        Node<T> newFront = front.getLink();
        front = newFront;

        size --;

        return  oldFront.getValue();
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void clear() {
        front = null;
        size = 0;
    }

    public String toString(){
        String result = "front[";

        if (size != 0){

            Node<T> actualFront = front;

            for(int i = 0; i<size; i++){
                result += actualFront.getValue() + " ";
                actualFront = actualFront.getLink();
            }
        }

        result += "]back";

        return result;
    }
}

package com.akezhanmussa.sorted_queue;

import com.akezhanmussa.adt.SortedQueue;
import com.akezhanmussa.impl.LinkedListSortedQueue;
import com.akezhanmussa.impl.Student;
import com.akezhanmussa.impl.StudentName;


public class Main {

    public static void main(String[] args) {
        SortedQueue<Integer> sortedQueue = new LinkedListSortedQueue();
        System.out.println("----------THE SORTED QUEUE---------");

        for(int i = 0; i<9;i++){
            int val = (i+1)*10;
            sortedQueue.insert(val);
        }

        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());

        for (int i = 0; i<3;i++){
            try{
                sortedQueue.dequeue();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        for(int i = 0; i<9;i++){
            int val = (i+1)*100;
            sortedQueue.insert(val);
        }

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        for (int i = 0; i<4;i++){
            try{
                sortedQueue.dequeue();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        for(int i = 1; i<183;i+=2){
            int val = (i)*5;
            sortedQueue.insert(val);
        }

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        int size = sortedQueue.getSize();

        for (int i = 0; i<size;i++){
            try{
                sortedQueue.dequeue();
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        sortedQueue.insert(5);
        sortedQueue.insert(10);
        sortedQueue.insert(2);

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        sortedQueue.clear();

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();

        sortedQueue.insert(23232);
        sortedQueue.insert(21);
        sortedQueue.insert(121);
        sortedQueue.insert(2323);

        System.out.println();
        System.out.println(sortedQueue);
        System.out.println(sortedQueue.getSize());
        System.out.println();


        SortedQueue<Student> studentSortedQueue = new LinkedListSortedQueue();

        Student cruse = new Student(10,"cruse");
        Student toni = new Student(121,"toni");
        Student arnold = new Student(2221,"arnold");

        studentSortedQueue.insert(toni);
        studentSortedQueue.insert(cruse);
        studentSortedQueue.insert(arnold);

        System.out.println();
        System.out.println(studentSortedQueue);
        System.out.println(studentSortedQueue.getSize());
        System.out.println();

        try{
            studentSortedQueue.dequeue();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }

        System.out.println();
        System.out.println(studentSortedQueue);
        System.out.println(studentSortedQueue.getSize());
        System.out.println();


        SortedQueue<StudentName> studentNameSortedQueue = new LinkedListSortedQueue();

        StudentName cruser = new StudentName(10,"cruse");
        StudentName tonir = new StudentName(121,"toni");
        StudentName arnolder = new StudentName(2221,"arnold");

        studentNameSortedQueue.insert(cruser);
        studentNameSortedQueue.insert(tonir);
        studentNameSortedQueue.insert(arnolder);

        System.out.println();
        System.out.println(studentNameSortedQueue);
        System.out.println(studentNameSortedQueue.getSize());
        System.out.println();





    }
}

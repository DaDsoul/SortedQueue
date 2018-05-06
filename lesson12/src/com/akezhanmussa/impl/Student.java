package com.akezhanmussa.impl;

public class Student implements Comparable<Student>{

    private int iD;
    private String name;

    public Student(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        if (this.iD < o.iD){
            return -1;
        } else if (this.iD > o.iD){
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {

        String guy = name +  "with iD: "+ iD;

        return guy;
    }
}

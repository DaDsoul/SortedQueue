package com.akezhanmussa.impl;

public class StudentName implements Comparable<StudentName>{

    private int iD;
    private String name;

    public StudentName(int iD, String name) {
        this.iD = iD;
        this.name = name;
    }

    @Override
    public int compareTo(StudentName o) {
        if (this.name.compareTo(o.name) < 0){
            return -1;
        } else if (this.name.compareTo(o.name) > 0){
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

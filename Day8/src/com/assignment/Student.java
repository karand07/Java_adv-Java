package com.assignment;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int roll;
    private double marks;
    public Student(String name, int roll , double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
}

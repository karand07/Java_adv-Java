package com.assignment;

import java.io.*;
import java.util.Scanner;

public class StudentUtil {
    public static void main(String[] args) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("/home/karan/Java_adv-Java/Day8/src/com/assignment/student.txt"))) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Student name ");
            String name = sc.nextLine();
            System.out.println("Enter Student roll  ");
            int roll = sc.nextInt();
            System.out.println("Enter Student marks");
            double marks = sc.nextDouble();
            Student std = new Student(name,roll,marks);

            out.writeObject(std);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter Class Strength");
        int size = sc.nextByte();
        Student [] student = new Student[size];
        int opt ;
        String name;
        System.out.println("Enter rollno  to start from:");
        int rollno = sc.nextInt();

        double percentage;
        int counter =0;
        do{
            System.out.println("Select Option:");
            opt = sc.nextInt();
           switch (opt){
               case 1->{
                   System.out.println("---Enter Student Data");
                   for (int i = 0; i < student.length; i++) {
                       System.out.println("Enter rollno , name , percentage");
                       rollno += counter  ;
                       name = sc.next();
                       percentage = sc.nextDouble();
                       student[i]= new Student(rollno,name,percentage);
                       counter++;
                       System.out.println("Stop Press 1 :");
                       sc.nextInt();
                   }
               }
           }
        }while(opt != 6);



        for (Student value : student) {
            value.atoString();
        }
    }
}

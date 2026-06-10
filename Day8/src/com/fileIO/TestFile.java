package com.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class TestFile {
    public static void main(String[] args) throws Exception {
       String filename = "/home/karan/Java_adv-Java/Day8/src/input.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(filename));
            PrintWriter pw = new PrintWriter("/home/karan/Java_adv-Java/Day8/src/output.txt");){
            String str = null ;
            while ((str = br.readLine()) != null) {
                pw.println(str);
            }
            System.out.println("------data copied done--------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

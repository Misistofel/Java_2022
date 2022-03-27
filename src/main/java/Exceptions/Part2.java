package Exceptions;

import java.io.*;

public class Part2 {
    public static void main(String[] args) {

        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println(" Have a good day!!");
        } catch (FileNotFoundException e) {
            System.out.println("Was found exception!!");
        } catch (IOException n) {
            System.out.println("Was found exception!!");
        } finally {
            System.out.println("Today is Sunday!");
        }
    }
}
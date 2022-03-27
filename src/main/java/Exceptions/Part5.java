package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Part5 {
    void abc() throws FileNotFoundException {
        File f = new File("test7.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println(" Have a good day!!");
        System.out.println("Was found exception!!");
    }

    //коли ми в авс методі просто написали Throws тоді def просить обробити всередині себе даний ексепшн
    void def() {
        System.out.println("Hi!");
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception was found!!" + e.getMessage());
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Part5 p5 = new Part5();
        p5.def();
    }
}
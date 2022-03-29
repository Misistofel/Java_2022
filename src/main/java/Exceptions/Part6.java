package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part6 {
    void abc() throws FileNotFoundException {
        File f = new File("test9.txt");

        FileInputStream fis = new FileInputStream(f);
        System.out.println(" Have a good day!!");
        System.out.println("Was found exception!!");
    }

    // замість FileNotFoundException можемо писати батьківський класIOException
    void def() throws IOException {
        System.out.println("Hi!");
        abc();
    }
}

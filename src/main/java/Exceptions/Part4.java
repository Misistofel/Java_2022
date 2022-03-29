package Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Part4 {
    void abc(){
        File f = new File("test9.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println(" Have a good day!!");
        } catch (FileNotFoundException e) {
            System.out.println("Was found exception!!");
        }
    }
    //коли в abc методі було оброблено виклчення то метод defякий його не має проблем
    //але якби мо в авс методі просто написали Throws тоді def знав би про це і просив би обробити всередині себе даний ексепшн - дівісь part 5
    void def(){
        System.out.println("Hi!");
        abc();
    }

}

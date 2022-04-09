package IO_NIO_Streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainReadingfFromFile {

    public static void main(String[] args) {

        //РОБОТА З БАЙТОВИМ та  СИМВОЛЬНИМ потоками
        FileInputStream fis = null;
        InputStreamReader isr = null;
        int b = 0;

        try {
            fis = new FileInputStream("test.txt");//це байтовий потік
            isr = new InputStreamReader(fis,"UTF-8");

            while( (b=isr.read())!= -1){ //щоб прочитати цей файл треба помістити це метод в цикл while, бо він читає лише один байт з файлу,
                System.out.print((char)b);//приводимо до типу char
            }
            //а нем треба все що написано в файлі. Коли метод вертає -1 це значить що ми дочитали наш файл
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

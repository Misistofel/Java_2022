package Exceptions.tryWithResources;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader(new File("someFileName"));
            // тут ми отримуємо: Unhandled exception: java.io.FileNotFoundException
            //тобто треба загорнути в try-catch
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
//але це ще не все , бо public abstract class Reader implements Closeable інтерфейс
            //якій треба закрити
        } finally {
            // і знову маємо підсвітку: Unhandled exception: java.io.IOException
            //тобто що? знову робити try-catch?
            try {
                reader.close();
            }
            catch(IOException eo){
                eo.printStackTrace();
            }
// І це є дуже погана практика: boiler-plate-code. Але на щастя в java 7 з'явилася можливість
            //не робити таке

        }
    }
}
/*Усі класи,які імплементують Closeable як відомо треба закривати. І тепер можна писати простіше - дивись
TryWithResourcesRight*/
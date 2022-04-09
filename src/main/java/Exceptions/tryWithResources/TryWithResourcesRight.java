package Exceptions.tryWithResources;

import java.io.*;

public class TryWithResourcesRight {
    public static void main(String[] args) {
        /*щоб код не повторювався, щоб його скоротити використовуєм таке: тепер блок finally прибрано і класи
         що імплементують Closeable закриваються автоматично
         Тепер  interface Closeable extends  AutoCloseable
      Тепер використовуємо Try with resources*/

        try (Reader reader = new FileReader(new File("someFileName"));
        Writer w = new FileWriter(new File("someFileName2"))
        ) {
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//тут блок finally не потрібен - все автоматично закривається

/* Класи що імплементують Closeable:
Reader
Writer
InputStream
OutputStream
Connection
Statement
ResultSet
 */





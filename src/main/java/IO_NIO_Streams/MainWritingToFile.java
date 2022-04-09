package IO_NIO_Streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainWritingToFile {
    public static void main(String[] args) {

        FileOutputStream fos = null;
        String str = "Marinochka";

        {
            try {
                fos = new FileOutputStream("test.txt");
                fos.write(str.getBytes());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}//Ми таким чином затерли те що у нас бцло до того у файлі test.txt
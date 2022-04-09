package IO_NIO_Streams;

import java.io.*;

public class MainFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        String str = "Marinochka";

        try {
            fw = new FileWriter("test.txt", true);   /*true ставимо щоб не затираляся попередня інфа у файлі*/
            fw.write(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
package IO_NIO_Streams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class MainNewFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        String str = "Marinochka";
        File file = new File("test2.txt"); //створили новий порожній файл
        //клас File дозволяє працювати з файлами та каталогами на зовнішніх носіях
        //Дозволяє створювати, змінювати, надавати доступ та інше
        try {
            fw = new FileWriter(file, true);   /*true ставимо щоб не затираляся попередня інфа у файлі*/
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

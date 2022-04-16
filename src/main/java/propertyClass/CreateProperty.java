package propertyClass;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class CreateProperty {
    public static void main(String[] args) throws IOException {
          Properties p = new Properties();
//        p.setProperty("Margo", "5000$");
//        //System.out.println(p.getProperty("Margo"));
//        FileOutputStream fos = new FileOutputStream("margoProperties");
//        p.store(fos, "Margo commented");

        FileInputStream fis = new FileInputStream("margoProperties");
        p.load(fis);
        System.out.println(p.getProperty("Margo"));

    }
}

package propertyClass;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {

    public void createPropertyFile() throws IOException {
        Properties p = new Properties();
        p.setProperty("January", "01");
        //System.out.println(p.getProperty("Margo"));
        FileOutputStream fos = new FileOutputStream("monthsProperties");
        p.store(fos, "Marina commented");
    }

    public void readPropertyFile() throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("monthsProperties");
        p.load(fis);
        System.out.println(p.getProperty("January"));
    }

    public static void main(String[] args) throws IOException {
        PropertiesReader pr = new PropertiesReader();
        pr.createPropertyFile();
        pr.readPropertyFile();
    }

}


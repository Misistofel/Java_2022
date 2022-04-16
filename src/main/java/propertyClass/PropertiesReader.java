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
        p.setProperty("February", "02");
        p.setProperty("March", "03");
        p.setProperty("April", "04");
        p.setProperty("May", "05");
        //System.out.println(p.getProperty("Margo"));
        FileOutputStream fos = new FileOutputStream("monthsProperties");
        p.store(fos, "Marina commented");
    }

    public void readPropertyFile(String s) throws IOException {
        Properties p = new Properties();
        FileInputStream fis = new FileInputStream("monthsProperties");
        p.load(fis);
        System.out.println(p.getProperty(s));
    }

    public static void main(String[] args) throws IOException {
        PropertiesReader pr = new PropertiesReader();
        pr.createPropertyFile();
        pr.readPropertyFile("April");

    }

}


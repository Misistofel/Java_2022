package propertyClass;

import java.io.*;
import java.util.Properties;

public class CreateAndChangeProperties {
    public static final String PATH = "src/main/First.properties";

    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileOutputStream out = new FileOutputStream("First.properties");
        p.store(out, null);


        p.setProperty("country", "Ukraine");
        p.store(out, "My second  comment");




    }
}
package propertyClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {

        Properties p = new Properties();
        p.setProperty("property_key_1", "value_1");
        p.setProperty("login", "margo");
        p.setProperty("pwd", "123Q");
        p.setProperty("site", "QA");
        FileWriter  writer = new FileWriter("file.properties");
        p.store(writer, "Author: Marina");
        writer.close();

    }
}

package propertyClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

    public class Props {
        //пшлях до нашого файлу конфигураций
        public static final String PATH_TO_PROPERTIES = "src/main/file.properties";

        public static void main(String[] args) {

            FileInputStream fileInputStream;
            //ініціалізуємо специальний об'ект Properties
            //типу Hashtable для зручної роботи з даними
            Properties prop = new Properties();

            try {
                //звертаємося до файлу та отримуємо дані
                fileInputStream = new FileInputStream(PATH_TO_PROPERTIES);
                prop.load(fileInputStream);

                String site = prop.getProperty("site");
                String loginToSite = prop.getProperty("login");
                String passwordToSite = prop.getProperty("password");

                //друкуємо дані на консоль
                System.out.println(
                        "site: " + site
                                + "\nloginToSite: " + loginToSite
                                + "\npasswordToSite: " + passwordToSite
                );

            } catch (IOException e) {
                System.out.println("Помилка в програмі: файл " + PATH_TO_PROPERTIES + " не знайдено");
                e.printStackTrace();
            }

        }

    }


package lesson1.Transient;

import java.io.IOException;
import java.time.LocalDate;

import static lesson1.Transient.User.deserialize;
import static lesson1.Transient.User.serialize;

public class Main1 {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    // вставьте свой путь до файла
    final String path = "D:/STUDY/user.ser";

    //создаем наш объект
    User user = new User();
    user.setFirstName("Stefan");
    user.setLastName("Smith");
    user.setEmail("ssmith@email.com");
    user.setBirthDate(LocalDate.of(1991, 7, 16));
    user.setLogin("ssmith");
    user.setPassword("gemma_arterton_4ever_in_my_heart91");

    System.out.println("Initial user: " + user + "\r\n");


    serialize(user, path);
    User loadedUser = deserialize(path);
    System.out.println("Loaded user from file: " + loadedUser + "\r\n");
  }

}

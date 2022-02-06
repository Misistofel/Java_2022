package lesson1.Transient;

import java.io.*;
import java.time.LocalDate;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  private String firstName;
  private String lastName;
  private String email;
  private LocalDate birthDate;
  private String login;
  private transient String  password;//transient — это модификатор, указываемый перед полем класса (подобно другим модификаторам,
  // таким как public, final и т.д.) для обозначения того, что данное поле не должно быть сериализовано.

  public User() {}

  public User(String firstName, String lastName, String email, LocalDate birthDate, String login, String password) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.birthDate = birthDate;
    this.login = login;
    this.password = password;
  }


  @Override
  public String toString() {
    return "User{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", email='" + email + '\'' +
            ", birthDate=" + birthDate +
            ", login='" + login + '\'' +
            ", password='" + password + '\'' +
            '}';
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setBirthDate(LocalDate birthDate) {
    this.birthDate = birthDate;
  }

  public void setLogin(String login) {
    this.login = login;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public static long getSerialVersionUID() {
    return serialVersionUID;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public LocalDate getBirthDate() {
    return birthDate;
  }

  public String getLogin() {
    return login;
  }

  public String getPassword() {
    return password;
  }

  static void serialize(User user, String path) throws IOException {
    FileOutputStream outputStream = null;
    ObjectOutputStream objectOutputStream = null;
    try {
      //створимо 2 потоки для серіалізації об'єкту та збереження його у файл
      outputStream = new FileOutputStream(path);
      objectOutputStream = new ObjectOutputStream(outputStream);

      // зберігаємо об'ект у файл
      objectOutputStream.writeObject(user);
    } finally {
      // Закриваємо потоки у блоці finally
      if (objectOutputStream != null) {
        objectOutputStream.close();
      }
      if (outputStream != null) {
        outputStream.close();
      }
    }
  }
  /*Напишемо метод для десериализації.
  Метод приймає строку path (шлях до файлу з якого об'ект буде “загружений”)і вертає об'ект типн User:
   */
  static User deserialize(String path) throws IOException, ClassNotFoundException {
    FileInputStream fileInputStream = null;
    ObjectInputStream objectInputStream = null;

    try {

      //создаем 2 потока для десериализации объекта из файла
      fileInputStream = new FileInputStream(path);
      objectInputStream = new ObjectInputStream(fileInputStream);

      //загружаем объект из файла
      return  (User) objectInputStream.readObject();
    } finally {
      if (fileInputStream != null) {
        fileInputStream.close();
      }
      if (objectInputStream != null) {
        objectInputStream.close();
      }
    }
  }
}

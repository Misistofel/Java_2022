package lesson1.Instanceof_operator;

public class Parent {
 private String name;
 private String surname;
 private int age;

  public Parent() {
  }

  public Parent(String name, String surname, int age) {
    this.name = name;
    this.surname = surname;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setAge(int age) {
    this.age = age;
  }
}

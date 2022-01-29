package Lesson2;

public class Human_this {
  String name;
  String surname;
  int age;

  public void setName(String name) {
    this.name = name;
  }

  public Human_this(String name, String surname) {
    this.name = name;
    this.surname = surname;
  }

  public Human_this (String name, String surname, int age){
    this(name,surname);
    this.age = age;
  }

}

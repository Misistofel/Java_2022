package Lesson2.Inheritance;

import Lesson2.Inheritance.overriding.Food;

public class Employee {
  String name;
  String lastName;
  String nationality = "ukrainian";
  String salary;
  int holliday;

  public void eat(){
    System.out.println("I am eating!!");
  }

  public void sleep(){
    System.out.println("I am sleeping!!");
  }
}

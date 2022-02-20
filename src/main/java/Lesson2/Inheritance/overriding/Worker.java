package Lesson2.Inheritance.overriding;

public class Worker {
  String name;
  String lastName;
  String nationality = "ukrainian";
  String salary;
  int holliday;

  public Food eating() {
    Food f = new Food();
    System.out.println("Employee is eating!!");
    return f;
  }

  public void sleeping(){
    System.out.println("Employee is sleeping!!");
  }
}

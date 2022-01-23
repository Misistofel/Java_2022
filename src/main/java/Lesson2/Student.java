package Lesson2;

public class Student {
  public String name;
  public String lastName;
  public int cource;
  public int age;
 static int numberOfStudentsCreated;

  public Student(String name, String lastName, int cource, int age) {
    numberOfStudentsCreated++;
    this.name = name;
    this.lastName = lastName;
    this.cource = cource;
    this.age = age;
  }

  public static void showNumberOfStudents(){
    System.out.println("The number of Student-objects created are " + numberOfStudentsCreated);
  }
}

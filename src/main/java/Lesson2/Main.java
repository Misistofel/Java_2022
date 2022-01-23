package Lesson2;

public class Main {
  public static void main(String[] args) {
    Student s1 = new Student("Tonio", "Groff", 1, 18);

    //System.out.println(s1.numberOfStudentsCreated);
    System.out.println(Student.numberOfStudentsCreated);
    Student.showNumberOfStudents();
    System.out.println(s1.age);

    Human_this h1 = new Human_this("Margo", "Cravets", 29);
    h1.setName("Maryna");
    System.out.println(h1.name);

    Car_innerClasses car1 = new Car_innerClasses("Volvo", 900, 45);
    Car_innerClasses.radio radio1 = car1.new radio(10);

    Car_innerClasses car2 = new Car_innerClasses("Volga", 1200, 55);
    Car_innerClasses.radio radio2 = car1.new radio(2);

    radio2.turnOnRadioo();




    //s1.sh - Чому через s1 я не бачу метод showNumberOfStudents()??????
  }
}

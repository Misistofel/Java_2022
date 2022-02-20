package Lesson2.Inheritance;

public class Main {

  public void salaryIncreasing(Employee e) {
    e.salary += 100;
  }

  public static void main(String[] args) {
    Doctor doctor = new Doctor(false);
    Surgeon surgeon = new Surgeon(true, "tyv09");
    //s.tool - tool is private! Error
    surgeon.getTool();

    Dantist dantist = new Dantist();//чому я можу створити об'єкт без параметрів - у мене ж немає дефольтного конструктора?
    Dantist dantist1 = new Dantist(false, "Child surgeon dantist", true);
    System.out.println(dantist1.hasOwnClinic);
    dantist.specialithation = "Chaild Dantist";
    Doctor.highEducation = true;
    System.out.println(dantist.specialithation + "Presence os high education:" + Doctor.highEducation );

    Driver driver = new Driver();
    Teacher teacher = new Teacher();

    Employee em1 = new Doctor(true);
    Employee em2 = new Driver();
    Employee em3 = new Teacher();
    Employee em4 = new Surgeon(true, "Scalp5876");
    //Surgeon s1 = new Doctor(true,"Pediatr") - Doctor не обов'язково Surgeon

  }
}

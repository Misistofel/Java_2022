package Lesson2.encapsulation;

public class Auto {
  String name;
  String age;
  int year;
  private final int run = 130;

  public Auto(String name, String age, int year) {
    this.name = name;
    this.age = age;
    this.year = year;
  }

  public int getRun() {
    return run;
  }

  public void gas() {
    System.out.println();
    System.out.println(" Speed is increasing!");
  }

    private void brake(){
      System.out.println("Speed is decreasing!");
    }
  }

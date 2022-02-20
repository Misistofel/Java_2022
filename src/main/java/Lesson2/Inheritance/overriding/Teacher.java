package Lesson2.Inheritance.overriding;

public class Teacher extends Worker {
  int countOfPuples;

  public void teaching(){
    System.out.println("I am teaching!!");
  }

  @Override
  public Fruits eating() {
    Fruits f = new Fruits();
    System.out.println("Teacher is eating!!");
    return f;
  }


  //this method is oOverloaded
  public void sleeping(int time) {
    System.out.println("Teacher is sleeping!");

  }
}

package Lesson2.encapsulation.package_01;

public class Human {
  final String sex;

  public Human(String sex) {
    this.sex = sex;
  }

  private String name;
  private int age;
  private int weight;

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public int getWeight() {
    return weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAge(int age) {
    if (age < 0 || age > 120) {
      System.out.println("Wtong data");
    } else {
      this.age = age;
    }
  }

    public void setWeight ( int weight){
    if (weight>0){
      this.weight = weight;
    }else{
      System.out.println("Wrong weight!");}
    }

}
class Test{
  public static void main(String[] args) {
    Human h = new Human("female");

    h.setAge(100);
    System.out.println("Human age is " +  h.getAge());

  }
}

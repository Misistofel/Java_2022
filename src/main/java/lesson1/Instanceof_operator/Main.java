package lesson1.Instanceof_operator;

public class Main {
  public static void main(String[] args) {

    Object o1 = new Daughter();
    Object o2 = new Son();

    Daughter d = (Daughter) o1;
    Daughter d1 = (Daughter) o2;
    //Son s = (Son)o2;

  }
}
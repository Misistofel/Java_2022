package lesson1;

public class LogicalOperators {
  public static void main(String[] args) {

    boolean a = true;
    boolean b = false;
    boolean f = false;
    int c = 5;
    int d = 7;

    boolean result1 = d>c || a;
    boolean result2 = d>c || b;
    boolean result3 = d>c && b;
    boolean result4 = d>c && b || a;
    boolean result5 = d>c && b && a;
    boolean result10 = a && b;
    boolean e = a!=b;

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(result5);
    System.out.println(e);
    System.out.println(result10);

  }
}
package lesson1;

public class Numerical_variables {
  public static void main(String[] args) {

    int a = 3;
    int b = 5;
    long c = 100L;
    short d = 130;
    float e = 250.6f;
    double f = 1300.1;
    int g = 5;
    boolean j = d>=e;
    boolean k = j;
    boolean l = g==a;// = е присвоєння а == це рівність
    boolean m = 5<=6;
    boolean n = c!=d;
    String i = "Hello";
    String ii = " world!";
    System.out.println(i==ii);

    i = ii;
    //    System.out.println(i);
    //    System.out.println(i==ii);
    short w = 32767;

    long result = ++g - b + ++c - --a - d++;
    System.out.println(result);
    System.out.println(d);

    a = b;
    c = d;
    f=e;
    e = a;

    System.out.println(a);
    System.out.println(c);
    System.out.println(f);//чому тут не 250.6 а 250.60000610351562 ?
    System.out.println(e);
    System.out.println(j);
    System.out.println(g>=a);
    System.out.println(l);
    System.out.println(m);
    System.out.println(n);


  }
}
package lesson1;

public class DoWhileLoop {
  public static void main(String[] args) {
    int i = 1;
    do {
      i *= 2;
      System.out.println(i);
    } while (i < 120);

    //Infinite loop
    int b = 10;
    do {
     // System.out.println("Привіт!");
    } while (b == 10);


    System.out.println("---------------------------");
    int godyny = 0;

    OUTER:
    do {
      int hvylyny = 0;

      INNER:
      while (hvylyny < 60) {
        System.out.println(godyny + ":" + hvylyny);
        hvylyny++;
      }
      godyny++;
    } while (godyny < 24);
  }
}

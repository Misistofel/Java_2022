package lesson1;

public class StringClass_2 {
  public static void main(String[] args) {
      /*Create string "this item previous price $5.99, Sale price $1.99. " - parse original and sale price from string
    and print them.*/

    String p = "this item previous price $5.99, Sale price $1.99. ";
    int index1 = p.indexOf("$");
    int index2 = p.indexOf(",");
    System.out.println("index1 = "+ index1);
    System.out.println("index2 = "+ index2);
    String p1 = p.substring(index1+1, index2);
    System.out.println("price 1= "+ p1);

    int index3 = p.indexOf("1");
    int index4 = p.indexOf(".");
    System.out.println("index3 = "+ index3);

    String p2 = p.substring(index3, 48);
    System.out.println("price 1= "+ p1);
    System.out.println("price 2= "+ p2);
  }
}

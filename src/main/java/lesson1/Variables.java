package lesson1;

public class Variables {
  public static void main(String[] args) {

    byte a = 2;         //-128..127
    short b = -32768;   //-32,768..32,767
    int c = 2147483647 ;              //-2,147,483,648..2,147,483,647
    long d = 9223372036854775807L;  //-9,223,372,036,854,775,808..9,223,372,036,854,775,807
    float e = 0.32f;
    double f = 123498989.09;
    char ch = 's';
    char ch1 = 97;
    String s = "Sorry";
    int[] array = new int[3];
    String[] str = new String[3];
    boolean[] arrayB = new boolean[2];


    System.out.println(a + " " + b + " " + c + " " + ch1 + " " + d + " " +e + " " +f + " " +s + " " );
  }
}

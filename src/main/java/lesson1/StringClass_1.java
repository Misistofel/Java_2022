package lesson1;

public class StringClass_1 {
  public static void main(String[] args) {


   /*Create string "      egweerw  ererferw  kuy  yu i      ". Print its length; Use trim() method to this string and
  print result. Print length of trimmed string. Split string by spaces and print each value in separate row.

   */

    String c = "      egweerw  ererferw  kuy  yu i      ";
    System.out.println(" length of c = " +c.length());
    String c1 = c.trim();
    //split po probilah-->otrymaju spysok
    //obrobka kognogo elementu array - List - zareplace probily-->print kojnogo slova
    System.out.println( "variable c1: " +c1 + "." );
    System.out.println(" length of c1 = " + c1.length());


    int j = c1.indexOf(" ");
    String firstWord = c1.substring(0,j);
    System.out.println("The first word is: " + firstWord + ".");

    String c2 = c1.substring(j).trim();
   // System.out.println("c2 =" + c2 + ".");


    int j1 = c2.indexOf("w");
   // System.out.println("j1 = " + j1);
    String secondWord = c1.substring(0,j1);
    System.out.println("The second word is: " +  secondWord + ".");

    String c3 = c2.substring(j1+1).trim();
    //System.out.println("c3 =" + c3 + ".");

    int j2 = c3.indexOf("y");
    //System.out.println("j2 = " + j2);
    String thirdWord = c3.substring(0,j2+1);
    System.out.println("The third word is: " +  thirdWord + ".");

    String c4 = c3.substring(j2+1).trim();
   // System.out.println("c4 =" + c4 + ".");

    int j3 = c4.indexOf("u");
    //System.out.println("j3=" + j3);
    String forthWord = c4.substring(0,j3+1);
    System.out.println("The forth word is: " +  forthWord + ".");

    String fifthWord = c4.substring(j3+1).trim();
    System.out.println("The fifth word is: " +  fifthWord + ".");

    /*Create string "   egweerw  ererferw  kuy  yu i ". Convert all 'e' characters to uppercase. Print result;*/

    String d = "   egweerw  ererferw  kuy  yu i ";
    String d1 = d.replace("e","E");
    System.out.println(d1);



  }
}
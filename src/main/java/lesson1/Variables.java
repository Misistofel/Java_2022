package lesson1;

public class Variables {
  public static void main(String[] args) {

    byte a = 2;         //-128..127
    short b = -32768;   //-32,768..32,767
    int c = 2;
    //-2,147,483,648..2,147,483,647
//    long d = 9223372036854775807L;  //-9,223,372,036,854,775,808..9,223,372,036,854,775,807
//    float e = 0.32f;
//    double f = 123498989.09;
//    char ch = 's';
//    char ch1 = 97;
//    String s = "Sorry";
//    int[] array = new int[3];
//    String[] str = new String[3];
//    boolean[] arrayB = new boolean[2];
//    int[][] array2 = new int[3][2];
//
//    for (int[] v : array2) {
//      for (int y : v) {
//
//        System.out.println(y);
//      }
//
//
//    }


//
//    System.out.println(a + " " + b + " " + c + " "+ ch + " " + ch1 + " " + d + " " +e + " " +f + " " +s + " " );
//    System.out.println("Масив містить таки елементи ");
//    for(int i=0; i<array2.length; i++) {
//      for(int j=0; j<array2[i].length; j++){
//        array2[i][j]=i+j;
//
//        System.out.println(array2[i][j]);
//      }

    //}


//    byte a1 ;         //-128..127
//    short b1 ;   //-32,768..32,767
//    int c1  ;              //-2,147,483,648..2,147,483,647
//    long d1 ;  //-9,223,372,036,854,775,808..9,223,372,036,854,775,807
//    float e1 ;
//    double f1 ;
//    char ch11 ;
//    char ch12 ;
//    String s1 ;

//    float aa = 0.5f ;   //, 0.7, 1.0, 0.1;
//    double bb=0.5 ;    //, 0.7, 1.0, 0.1;
//
//    aa=(float)bb;
//


    int[] arrey3 = new int[3];
    for (int i = 0; i < arrey3.length; i++) {
      arrey3[i] = i + 1;
      System.out.println(arrey3[i] +" ");
    }

    int n = 5;
    for(int m: arrey3){
      System.out.println(m=n);
      n++;
    }

  }
}
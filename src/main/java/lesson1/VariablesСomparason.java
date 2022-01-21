package lesson1;

public class VariablesСomparason {
  public static void main(String[] args) {
    int a=11;
    byte b = 22;
    a=b; //неявний кастинг - Розширююче перетворення

    int a1=11;
    byte b1 = 22;
    b1=(byte)a1; //явний кастинг - з втратою даних


    int a2=11;
    float b2 = 22;
    b2=a1;


    int a3 = 1;
    char b3 = '9';
    a3 = b3;

    System.out.println(b2);
    System.out.println(b3);

    double d = 3.89;
    int e = (int) d;

    System.out.println(e);

    int i = 128;
    byte g = (byte) i;
    System.out.println(g);//??? сому результат = 67???


    double k = 389889877779.89;
    short m = (short) k;
    System.out.println(m);

  }

}

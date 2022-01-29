package lesson1;

public class ForClass {
  /* Вивести год:хв:сек у інткрвали вид 0 до 6. Якщо год >1 а хв кратна 10 то метод треба закинчити.
  Якщо сек помножена на год більна хвилини то требе перейти на іншу хвилину
   */


  public static void showTime(){
    OUTER:
    for (int h = 0; h < 6; h++){
      MIDDLE:
      for (int m = 0; m < 60;m++){
        if(m%10==0 && h>1){
          break OUTER ;
        }
        INNER:
        for (int s = 0; s < 60; s++){
          if (s * h > m)
            continue MIDDLE;
          System.out.println(h + ":" + m + ":" + s);
        }
      }
    }
  }

  public static void showInfiniteLoopTime(){
    OUTER:
    for (int h = 0; h >= 0; h++){
      MIDDLE:
      for (int m = 0; m < 60;m++){
        if(m%10==0 && h>1){
          break OUTER ;
        }
        INNER:
        for (int s = 0; s < 60; s++){
          if (s * h > m)
            continue MIDDLE;
          System.out.println(h + ":" + m + ":" + s);
        }
      }
    }
  }


  public void showTriangle(){
    OUTER:
    for (int i = 0; i < 10; i++){
      INNER:
      for (int j = 0; j < 10; j++){
        if(j>=i){
          break ;
        } System.out.print(j + " ");
      }
      System.out.print(i+ " ");
      System.out.println();

    }
  }

  public void notShow87(){
    OUTER:
    for (int i = 0; i<100; i++){
      if(i==87){
        continue;
      }
      System.out.print(i + " ");

    }
  }

//  int k = 100;
//  for(){
//    System.out.println(k);
//  }


}

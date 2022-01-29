package lesson1;

import java.sql.SQLOutput;

public class WhileDo {
  /* while loop  використовуємо тоді, коли заздалегідь не відома к-сть повторів*/
  public static void main(String[] args) {
    int i = 1;
//    while (i < 10) {
//      System.out.println("Число " + i + " менше 10");
//      i++;
//    }

//    Month m = new Month();
//    m.showNotWinterMonths(5);
    Math ma = new Math();
//    ma.showNumber();
    ma.showInfiniteLoop();
  }
}

class Month {
  public void showNotWinterMonths(int monthNumber) {
    while (monthNumber > 2 && monthNumber < 12) {
      switch (monthNumber) {
        case 1:
          System.out.println("Jenuary");
          break;
        case 2:
          System.out.println("February");
          break;
        case 3:
          System.out.println("March");
          break;
        case 4:
          System.out.println("April");
          break;
        case 5:
          System.out.println("May");
          break;
        case 6:
          System.out.println("Jun");
          break;
        case 7:
          System.out.println("July");
        case 8:
          System.out.println("August");
          break;
        case 9:
          System.out.println("September");
          break;
        case 10:
          System.out.println("October");
          break;
        case 11:
          System.out.println("November");
          break;
        case 12:
          System.out.println("December");
          break;
        default:
          System.out.println("Invalid month ");
      }
      monthNumber++;
    }

  }
}

class Math {
  //Виводити н екран число допоки воно не почне одночасно ділитися і на 3 і на 7
  int a = 1;

  public void showNumber() {
    while (!(a % 3 == 0 && a % 7 == 0)) {
      System.out.println(a);
      a++;

    }
  }

  //INFINIT LOOP
  int n = 5;

  public void  showInfiniteLoop() {
    while (n > 3) {
      System.out.println(n + " < 3");
      n++;
    }
  }
}
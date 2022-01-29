package lesson1;

public class SwitchClass {
  public static void main(String[] args) {

    String a = "Wen";
    switch (a) {
      case "Mon":
        System.out.println("Working day 1");
        break;
      case "Tue":
        System.out.println("Working day 2");
        break;
      case "Wen":
        System.out.println("Working day 3");
        break;
      case "Thi":
        System.out.println("Working day 4");
        break;
      case "Fri":
        System.out.println("Working day 5");
        break;
      case "Sut":
        System.out.println("Weekend 6");
        break;
      case "Sun":
        System.out.println("Weekend 7");
        break;

    }

    System.out.println(" ");
    switch (a) {
      case "Mon":
        System.out.println("Working day 1");
      case "Tue":
        System.out.println("Working day 2");
      case "Wen":
        System.out.println("Working day 3");
      case "Thi":
        System.out.println("Working day 4");
      case "Fri":
        System.out.println("Working day 5");
      case "Sut":
        System.out.println("Weekend 6");
      case "Sun":
        System.out.println("Weekend 7");
      default:
        System.out.println(" Неправильне значення");

    }

    System.out.println("----------------------");
    int b = 2;
    //double float long booleand DONT use with switch!!! No other reference types use with switch!!
    switch (b) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("Working day ");
        break;
      case 6:
        System.out.println("Weekend 6");
        break;
      case 7:
        System.out.println("Weekend 7");
        break;
      default:
        System.out.println("Неправильне значення");

    }
    System.out.println("----------2--2--2--------");
    int c = 2;
    switch (b) {
      case 1:
      case 2*3:
      case 3:
      case 12%3:
      case 5:
        System.out.println("do exercise");
        break;
      default:
        System.out.println("wrong value");

    }
  }
}

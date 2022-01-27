package lesson1;

public class ConditionOperators {
  public static void main(String[] args) {

    int s = 10;

    if (s != 2) {
      System.out.println("s not equal 2");
    }
    System.out.println("--------------------------- ");


    int d = 5;

    if (d < 10) {
      System.out.println("Number less then 10");
    } else {
      System.out.println("Hi all!");
    }
    System.out.println("--------------------------- ");

    int f = 5;
    int j = 10;

    if (j > 2 * f) {
      System.out.println("j more twice more then f");
    }
    if (j == 2 * f) {
      System.out.println("j equal f");
    }
    if (j < 2 * f) {
      System.out.println("j less then f");
    } else {
      System.out.println("????");
    }
    System.out.println("--------------------------- ");


    int e = 50;

    if (e < 10) {
      System.out.println("Number less then 10");
    } else
      System.out.println("Hi all!");
    System.out.println("That is all ");
    System.out.println("--------------------------- ");


    int salaryOffered = -500;
    String compamy = "IT";

    if (salaryOffered < 500 && !compamy.equals("IT")) {
      System.out.println("Offer is not accepted");

    } else if (salaryOffered < 500 && compamy.equals("IT")) {
      System.out.println("Start my carrier in IT ");

    } else if (salaryOffered >= 500 && !compamy.equals("IT")) {
      System.out.println("Accept an offer - i dont care about IT");

    } else {
      System.out.println("No reacnion");
    }

    System.out.println("--------------------------- ");
    String sex = "h";
    int age = 599058603;
    boolean expirience = true;

    if (sex == "f" && age >= 18 || expirience == true) {

      if (age <= 60) {
        System.out.println("Welcome on board!");
      } else {
        System.out.println("The age is more then 60 - sorry , we cant propose ths job!");
      }
    } else
      System.out.println("Incorrect information!");
    System.out.println("--------------------------- ");

  }
}

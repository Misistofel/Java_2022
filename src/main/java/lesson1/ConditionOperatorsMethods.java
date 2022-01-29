package lesson1;

public class ConditionOperatorsMethods {

  public int searchMax(int a, int b, int c) {
    if (a > b && a > c) {
      System.out.println("Max nuber is " + a);
      return a;
    } else if (b > a && b > c) {
      System.out.println("Max nuber is " + b);
      return b;
    } else if (c > a && c > b) {
      System.out.println("Max nuber is " + c);
      return c;
    } else {
      System.out.println();
      return 0;

    }
  }


  public int searchMin(int a, int b, int c) {
    if (a < b && a < c) {
      System.out.println("Min nuber is " + a);
      return a;
    } else if (b < a && b < c) {
      System.out.println("Min nuber is " + b);
      return b;
    } else if (c < a && c < b) {
      System.out.println("Min nuber is " + c);
      return c;
    } else {
      System.out.println();
      return 0;

    }

  }

  public boolean searchEqual(int a, int b){
    if (a==b){
      System.out.println("true");
      return true;
    }else{
      System.out.println("false");
      return false;
    }
  }

  public int mod(int val, int mod){
    if(val == mod){
      System.out.println("val = mod, reminder is "+ val % mod);
      return val % mod;
    }else if(val > mod){
      System.out.println("Reminder is " + val % mod);
      return val % mod;
    }else  if (val < mod){
      System.out.println(" Reminder = " +val);
      return val % mod;
    }else{
      System.out.println("Invalid");
      return 0 ;
    }
  }
}

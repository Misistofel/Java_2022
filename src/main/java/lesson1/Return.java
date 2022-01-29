package lesson1;

class Return {
  public void breakShow() {
    for (int i = 0; i < 10; i++) {
      if (i == 5)
        break;
      System.out.print(i);
    }
    System.out.println("ku-ku");
    System.out.println("--------------------");
  }

    public void returnShow(){
    for (int i = 0; i < 10; i++) {
      if (i == 5)
        return;
      System.out.print(i);
    }
      System.out.println("ku-ku");
    System.out.println("--------------------");
  }
  }






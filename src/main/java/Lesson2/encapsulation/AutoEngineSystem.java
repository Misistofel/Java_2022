package Lesson2.encapsulation;

public class AutoEngineSystem {    //Головній клас - той чиїм імєям названо файл - не можу бути private
 protected int fuilTank;
 private int pipesCount=2;

  public int getPipesCount() {
    System.out.println("Pipe count = " + pipesCount);
    return pipesCount;
  }

  public class MyPrivateClass{    //вкладний клас може бути приватним,
    // але тоді я не зможу створити його об.єкт и викликати???????????????????????????навищо є така можлівить?
    void runEngine(){
      System.out.println("Engine is working!");
    }

  }
}

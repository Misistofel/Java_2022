package Lesson2;

public class Car_innerClasses {
  private String model;
  private int weight;

  private int fuilTank;

  public Car_innerClasses(String model, int weight, int fuilTank) {
    this.model = model;
    this.weight = weight;
    this.fuilTank = fuilTank;
  }

  public void showValueOfFuilTank(String model){
    System.out.println("the value of fuil tank is "+ fuilTank);

  }

  public class radio{
    int numberOfChannels;

    public radio(int numberOfChannels) {
      this.numberOfChannels = numberOfChannels;
    }

    public void turnOnRadioo(){
      System.out.println("Radio is turned on!");
    }

    //Внутренний класс не может содержать статические переменные и методы.
    //Логика здесь та же: статические методы и переменные могут существовать и вызваться даже при отсутствии объекта.
    //Но без объекта «внешнего» класса доступа к внутреннему классу у нас не будет.
    //static int volume; - видає помилку!!!

  }


}

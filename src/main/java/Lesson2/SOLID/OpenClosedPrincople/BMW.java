package Lesson2.SOLID.OpenClosedPrincople;

public class BMW extends  Car{
    String carName = "BMW";

    public BMW() {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void getPrice() {
        System.out.println(" Price is 2000");
    }
}

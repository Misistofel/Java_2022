package Lesson3.SOLID.OpenClosedPrincople;

public class Tesla extends Car {
    String carName = "Tesla";
    public Tesla() {
        this.carName = carName;
    }

    @Override
    public String getCarName() {
        return carName;
    }

    @Override
    public void getPrice() {
        System.out.println(" Price is 3000");
    }
}

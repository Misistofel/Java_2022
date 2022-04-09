package Lesson2.SOLID.OpenClosedPrincople;

public abstract class Car implements GetPriceInterface {
   String  carName = "Car";

    public Car() {
    }

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public void getPrice() {
        System.out.println(" Price is ");
    }


}

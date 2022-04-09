package Lesson2.SOLID.OpenClosedPrincople;

public class CarShop {

    String[] cars = new String[]{"Audi", "BMW", "Tesla"};

    public void getCarPrice(Car c){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].equals(c.getCarName())){
                c.getPrice();
            }
        }
    }
    }


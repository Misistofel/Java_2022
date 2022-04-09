package Lesson2.SOLID.OpenClosedPrincople;

import java.util.Scanner;

public class CarShopWrong {
    String[] cars = new String[]{"Audi", "BMW"};


    public void getCarPrice(String carName) {

        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == carName) {
                switch (cars[i]) {
                    case "Audi":
                        System.out.println(" price is 2000");

                    case "BMW": System.out.println(" price is 3000");

                }
            }
        }
    }//але якщо до магазину завезуть Tesla? nj ghsqltnmcz pvby.dfns vtnjl пуеЗкшсу - треба буде його розширювати, що суперечить принципу OpenClosed
}



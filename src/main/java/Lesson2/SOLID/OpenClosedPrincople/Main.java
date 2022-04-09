package Lesson2.SOLID.OpenClosedPrincople;

public class Main {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        BMW bmw = new BMW();
//        System.out.println(tesla.getCarName());
        CarShop carShop = new CarShop();
        carShop.getCarPrice(bmw);
    }
//Якщо додається нове авто то ми просто розшіряємо масив існуючих авто і не змінюємо реалізацію видачи ціни
}

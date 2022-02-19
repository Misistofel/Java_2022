package Lesson2.encapsulation.package_01;

import Lesson2.encapsulation.AutoEngineSystem;
import Lesson2.encapsulation.AutoEngineSystemPtototype;

public class Main {
  public static void main(String[] args) {

    AutoEngineSystem aes = new AutoEngineSystem();
    //aes.fuilTank - не видно бо protected fuilTank
  }
}
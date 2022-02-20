package Lesson2.encapsulation;

import Lesson2.Inheritance.Dantist;

public class Main_1 {

  public static void main(String args[]) {
    EncapTest encap = new EncapTest();
    encap.setName("Марина");
    encap.setAge(28);
    encap.setIdNum("12345");

    System.out.print("Им'я: " + encap.getName() + ", вік: " + encap.getAge());
    Auto auto = new Auto("Volvo", "V6", 2015);
    auto.gas();
    System.out.println(auto.getRun());

    AutoEngineSystem aes = new AutoEngineSystem();
    AutoEngineSystem.MyPrivateClass mpc = aes.new MyPrivateClass();
    mpc.runEngine();
    AutoEngineSystemPtototype aesp = new AutoEngineSystemPtototype();
    aesp.getPipesCount();

    Dantist da = new Dantist();
    //da.specialization - помилка бо protected!

  }
}
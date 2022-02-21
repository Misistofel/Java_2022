package Lesson2.Inheritance.overriding;

public class Test {

    void abc(Animal a){
      System.out.println("A");
    }

  void abc(Mouse m){
    System.out.println("M");
  }

  public static void main(String[] args) {
      Animal a= new Mouse();
      Test t = new Test();
      t.abc(a);//Тут "а" вікорістовується як проста змінна тому не треба в рантайми перевіряти на якій об'єкт вона посилається
      t.abc(a);//Тут runTime перевіряється який метод getName треба виеористовувати
  }
}

 class Animal{
  void getNmane(){
    System.out.println(" Animal");
  }

}
 class Mouse extends Animal{
  void getNmane(){
    System.out.println(" Mouse");
  }

}

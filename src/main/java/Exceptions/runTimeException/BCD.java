package Exceptions.runTimeException;

import Exceptions.runTimeException.ABC;

public class BCD {

    private ABC abc;

    public void foo() {
//        try {
//            abc.show();
//        } catch (NullPointerException e) {
//            System.out.println("Ділення на нуль");
//            System.out.println(e.getMessage());
//            e.printStackTrace();//обробляти такі помилки з RunTime Exception за допомогою try-catch - дурна робота.Їх треба заключати в if
//        }
        if (abc == null) {

            System.out.println("abc is null!");
        }
    }
}

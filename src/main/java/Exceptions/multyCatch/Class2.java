package Exceptions.multyCatch;

import Exceptions.runTimeException.ABC;

public class Class2 {
    private ABC abc = new ABC();

    public void foo() {
        try {
            abc.show();//якщо тут випадає exceptionто програма далі не йде - не дійде до наступного exception
            System.out.println(1/0);
        } catch (NullPointerException | ArithmeticException e) {
            //тобто тут буде виводитися АБО NullPointerException АБО ArithmeticException - разом не виведуться, для цього треба подвійний catch
           e.printStackTrace();
           e.getCause();
        }

    }
}

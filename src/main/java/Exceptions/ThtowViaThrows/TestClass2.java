package Exceptions.ThtowViaThrows;

public class TestClass2 {
    public int devided(int a, int b) throws ArithmeticException{
        int devided = a/b;
        return devided;
    }

    public static void main(String[] args) {
        TestClass2 t2 = new TestClass2();
        try{
        t2.devided(2,0);
        } catch (ArithmeticException a){
            System.out.println("Sorry, there is a problem! ");
            a.getMessage();
        }
        System.out.println("Hello world!");
    }
}

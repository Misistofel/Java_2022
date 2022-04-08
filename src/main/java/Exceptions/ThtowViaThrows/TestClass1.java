package Exceptions.ThtowViaThrows;

public class TestClass1 {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Not valid");
        }else{
            System.out.println("Welcome to vote");
        }
    }

    public static void main(String[] args) {

            validate(13);

    }
}
//Throw використовується для того щоб викидати exception в тому місці де ми того хочемо! Це - customized exceptions!
//Trowsвикористовуєьбя, наприклад, в такому випадку: я працюю над одним класом, а мій колега - над інщим. І я знаю , щомій метод викидає exception
//а мій колега не в курсі і хоче використати мій клас.
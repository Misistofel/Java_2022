package Exceptions.customException;

public class Main {
    public static void main(String[] args) throws MarinaException {

//        try{
//            int result = Factorial.getFactorial(6);
//            System.out.println(result);
//        }
//        catch(FactorialException ex){
//
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getNumber());
//        }


        Marina m = new Marina("Marina");
       // m.marinaIsFed();
        m.marinaIsWashed();
        m.marinaCommunicateWithRelatives();


    }
}

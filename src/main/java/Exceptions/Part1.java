package Exceptions;

public class Part1 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 1};
        /*System.out.println("We have an array!");
        System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
        System.out.println("Have a good day!");// це не виведеться на екран*/
        try {
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Attention!! ArrayIndexOutOfBoundsException was cought!!!");

            //Можна без finally
        }finally {
            System.out.println("Have a good day!");
        }
        System.out.println("It is not connected to try catch finaly");

    }


}
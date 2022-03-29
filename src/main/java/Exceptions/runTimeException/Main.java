package Exceptions.runTimeException;

import Exceptions.runTimeException.BCD;

public class Main {
    public static void main(String[] args) {
        BCD bcd = new BCD();
        bcd.foo();// got "NullPointerException"
    }
}

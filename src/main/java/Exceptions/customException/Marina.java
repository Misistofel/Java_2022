package Exceptions.customException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Marina {
    String name;
    boolean isMarinaEaten;
    boolean isMarinaWashed;

    public Marina(String name){
        this.name = name;

    }

    public void marinaIsFed() {
        System.out.println("Марина нагодована");
        this.isMarinaEaten = true;
    }

    public void marinaIsWashed() {
        System.out.println("Марина помита");
        this.isMarinaWashed = true;
    }

    public void marinaCommunicateWithRelatives() throws MarinaException {

        System.out.println("Збираємось на прогулянку!");
        if (isMarinaEaten && isMarinaWashed) {
            System.out.println("Ура, Марина спілкується з рідними! " + name + " дуже добра!");
        } else {
            throw new MarinaException( name + " не готова до спілкування з рідними! Зачиніть двері!");
        }
    }

//    public void marinaWritesComplaineLetter() throws MarinaCheckedException {
//        File f = new File("test9.txt");
//        FileInputStream fis = new FileInputStream(f);


//    }


}

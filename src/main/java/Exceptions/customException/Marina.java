package Exceptions.customException;

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

        System.out.println("Собираемся на прогулку!");
        if (isMarinaEaten && isMarinaWashed) {
            System.out.println("Ура, Марина спілкується з рідними! " + name + " дуже добра!");
        } else {
            throw new MarinaException("Марина " + name + " не готова до спілкування з рідними! Зачиніть двері!");
        }
    }
}

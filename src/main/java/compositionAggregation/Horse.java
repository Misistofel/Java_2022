package compositionAggregation;


public class Horse {
    private Halter halter;
    /*
    Об'єкт класу Halter створюється зовні від Horse і передається
     в конструктор для встановлення зв'язку.
     Якщо об'єкт класу Horse буде видалено, об'єкт класу Halter може і далі використовуватися,
      якщо, звичайно, на нього залишиться посилання:
    */
    public Horse(Halter halter) {
        this.halter = halter;
    }
}
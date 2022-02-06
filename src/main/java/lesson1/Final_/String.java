package lesson1.Final_;

public final class String {
  public static void main(String[] args) {

    final int[] array = {1, 2, 3, 4, 5};
    array[0] = 9;
    array[1] = 10;    //ок, т.к. изменяем содержимое массива – {9,2,3,4,5}
    // array = new int[5]; //помилка компіляції
  }
}
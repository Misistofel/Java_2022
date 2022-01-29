package lesson1;

public class Arrays {
  public static void main(String[] args) {

    int[][] array = new int[2][2];

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        array[i][j] = j + 1;
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }

    System.out.println();

    for (int[] a : array) {
      for (int b : a) {
        System.out.print(b + " ");
      }
      System.out.println();
    }
  }
}

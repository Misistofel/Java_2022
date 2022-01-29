package lesson1;

import java.util.ArrayList;

public class ForeachClass {
  //Створити масив з оцінок учняю Потім за допомогою for-each роздрукувати всі оцінки та вивести середню та максимальну оцінку,

  public void gradesOfPupil(int [] arr) {
    for (int grade : arr) {
      System.out.print(" " + grade + " ");
    }
  }

    public void maxGrade (int [] arr) {
      int avg = 0;
      for (int grade : arr) {
        if (grade > avg) {
          avg = grade;
        }
      }  System.out.println(avg + " is max grade! ");
    }

    public void avgGrade(int [] arr){
    int avgSum = 0;
    int count = 0;
      for (int grade : arr){
        count++;
        avgSum +=grade;
      }
      int avg = avgSum/count;
      System.out.println("Середня оцінка : " + avg + " балів!");
    }


  public void foreachInfiniteLoop(int [] arr) {
    for (int grade : arr) {
      grade++;
      System.out.println("Учень має такі бали :" + grade);
    }
  }
}



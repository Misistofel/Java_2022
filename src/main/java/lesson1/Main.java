package lesson1;

public class Main {
  public static void main(String[] args) {

//    ConditionOperatorsMethods c = new ConditionOperatorsMethods();
//    c.searchMax(3,6,9);
//    c.searchMin(4,5,-3);
//    c.searchEqual(2,3);
//    c.mod(5, 15);

//    ForClass.showTime();
    ForeachClass fe = new ForeachClass();
    int [] array = new int []{1,1,1,1,1};
//    fe.gradesOfPupil(array);
    fe.maxGrade(array);
    fe.avgGrade(array);


  }
}
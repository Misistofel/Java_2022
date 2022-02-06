package lesson1;
import java.util.ArrayList;
import java.util.List;

public class ForeachCollections {
  public static void main(String[] args) {

    List<String> names = new ArrayList<>();

    names.add("Маша");
    names.add("Олег");
    names.add("Ігор");
    names.add("Ченвенхао");

    for (String name : names) {
      System.out.println(name);
    }

    names.forEach(obj ->  System.out.println(obj));
  }
}
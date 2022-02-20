package Lesson2.Inheritance;

public class Surgeon extends Doctor {
  String scalpelModel;

  public Surgeon(boolean hasNurse, String scalpelModel) {
    super(hasNurse);
    this.scalpelModel = scalpelModel;
  }

  public Surgeon(String specialithation, boolean hasNurse, String scalpelModel) {
    super(specialithation, hasNurse);
    this.scalpelModel = scalpelModel;
  }

  public void operationCompletedSuccessfullty(){
    System.out.println("Opeeration was successfully completed!");
  }
}

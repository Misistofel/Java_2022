package Lesson2.Inheritance;

public class Doctor extends Employee {
  static boolean highEducation;
  protected String specialithation;
  private String tool;
  boolean hasNurse;

  public String getTool() {
    return tool;
  }

  public Doctor(boolean hasNurse) {
    this(null,hasNurse);//перезвернення до overloaded конструктор що знаходиться нижче
  }

  public Doctor(String specialithation, boolean hasNurse) {
    this.specialithation = specialithation;
    this.hasNurse = hasNurse;
  }
  //  public void setTool(String tool) {
//    if(tool.equals("sclpel" || "microscope" || "stethoscope")) {
//      this.tool = tool;
//    }else{
//      System.out.println("Wrong toll - it is not a doctor tool");
//    }
//  }  ЯК ДОДАТИ БАГАТО УМОВ В if ???????????????????

  public void  getPatient(){
    System.out.println("Patient is on appointment with a doctor");
  }
}

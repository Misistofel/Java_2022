package Lesson2.Inheritance;

public class Dantist extends Doctor {
  boolean hasOwnClinic;

  public Dantist() {
    super("Orthodontist", true) ;
  }

  public Dantist(boolean hasOwnClinic, String specialithation, boolean hasNurse) {
    super(specialithation, hasNurse);
    this.hasOwnClinic = hasOwnClinic;
  }
}

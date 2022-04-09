package Lesson3.SOLID.srp;

public class DataManagerImplementation implements IDataManager {

    public void sendMessage(String text){
        System.out.println("data sent successfully");
    }

    public  int receiveMessage(){
        System.out.println("Data is received!");
        return 0;
    }
}

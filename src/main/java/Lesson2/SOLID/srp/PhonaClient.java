package Lesson2.SOLID.srp;

public class PhonaClient {
    public static void main(String[] args) {
        Phone phone = new Phone(new ConnectionManagerImplementation(), new DataManagerImplementation());

        phone.dial("3804498900");
        phone.disconnect();
        phone.sendMessage(" Hello! How are you?");
        phone.receiveMessage();
    }
}

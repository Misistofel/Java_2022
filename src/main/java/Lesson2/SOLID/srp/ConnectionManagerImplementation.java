package Lesson2.SOLID.srp;

public class ConnectionManagerImplementation implements IConnectionManager {
    @Override
    public void dial(String phoneNumber) {
        System.out.println("connection established");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnected succsessfully!");
    }
}

package Lesson3.SOLID.srp;

public class Phone implements IDataManager, IConnectionManager {

    private ConnectionManagerImplementation connection;
    private DataManagerImplementation dataChanel;

    public Phone(ConnectionManagerImplementation connection, DataManagerImplementation dataChanel) {
        this.connection = connection;
        this.dataChanel = dataChanel;
    }

    @Override
    public void dial(String phoneNumber) {
        connection.dial(phoneNumber);
    }

    @Override
    public void disconnect() {
        connection.disconnect();

    }

    @Override
    public void sendMessage(String text) {
        dataChanel.sendMessage(" Hello1 How are you?");
    }

    @Override
    public int receiveMessage() {
        return dataChanel.receiveMessage();
    }
}


public class Person {

    private String clientName;
    private int clientTicket;

    public Person(String clientName, int clientTicket) {
        this.clientName = clientName;
        this.clientTicket = clientTicket;
    }

    public String getClientName() {
        return clientName;
    }

    public int getClientTicket() {
        return clientTicket;
    }

    @Override
    public String toString() {
        return "Person{" +
                "clientName='" + clientName + '\'' +
                ", clientTicket=" + clientTicket +
                '}';
    }
}

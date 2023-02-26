
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        List<String> client = new ArrayList<>();
        List<Integer> ticket = new ArrayList<>();
        Queue<String> qClients = new LinkedList<>();
        Queue<Integer> qTickets = new LinkedList<>();
        generateClients(client, ticket);
        for (int i = 0; i < client.size(); i++) {
            qClients.offer(client.get(i));
            qTickets.offer(ticket.get(i));
        }
        while (!qClients.isEmpty()) {
            person1.clientName = qClients.peek();
            person2.clientTicket = qTickets.peek();
            if (person2.clientTicket > 0) {
                System.out.println(qClients.peek() + " прокатился на аттракционе");
                person2.clientTicket = person2.clientTicket - 1;
                qTickets.poll();
                qTickets.offer(person2.clientTicket);
                qClients.poll();
                qClients.offer(person1.clientName);
            } else {
                qClients.poll();
                qTickets.poll();
            }
        }
    }

    public static List<String> generateClients(List<String> client, List<Integer> ticket) {
        client.add("Misha Ivanov");
        client.add("Ivan Zhukov");
        client.add("Sveta Ozerova");
        client.add("Masha Kalinina");
        client.add("Ira Dubinina");
        ticket.add(2);
        ticket.add(4);
        ticket.add(3);
        ticket.add(6);
        ticket.add(1);
        return client;
    }
}


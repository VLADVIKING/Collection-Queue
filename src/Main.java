
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Deque<Person> queue = new ArrayDeque<>();
        generateClients(queue);
        while (!queue.isEmpty()) {
            Person person = queue.peek();
            if (person.getClientTicket() > 0) {
                System.out.println(person.getClientName() + " прокатился на аттракционе");
                queue.poll();
                queue.addLast(new Person(person.getClientName(), person.getClientTicket() - 1));
            } else {
                queue.poll();
            }
        }
    }

    public static Deque<Person> generateClients(Deque<Person> queue) {
        queue.add(new Person("Misha Ivanov", 2));
        queue.add(new Person("Ivan Zhukov", 4));
        queue.add(new Person("Sveta Ozerova", 3));
        queue.add(new Person("Masha Kalinina", 6));
        queue.add(new Person("Ira Dubinina", 1));
        return queue;
    }
}


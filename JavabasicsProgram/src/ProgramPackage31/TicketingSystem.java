package ProgramPackage31;

import java.util.LinkedList;
import java.util.Queue;

public class TicketingSystem {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();

        // Customers arrive and join the ticket queue
        customerQueue.add("Customer 1");
        customerQueue.add("Customer 2");
        customerQueue.add("Customer 3");

        // Process customers in the order they joined the queue
        while (!customerQueue.isEmpty()) {
            String customer = customerQueue.poll();
            System.out.println("Serving: " + customer);
            // Process the customer's ticket purchase
        }
    }
}

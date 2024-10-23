
public class Main {
        public static void main(String[] args) {
        queue queue = new queue();

        // Enqueue customers (add them to the queue)
        queue.enqueue("Customer A");
        queue.enqueue("Customer B");
        queue.enqueue("Customer C");

        // Display the queue
        queue.displayQueue();

        // Dequeue (serve) the first customer
        System.out.println("Serving: " + queue.dequeue());

        // Display the queue after serving
        queue.displayQueue();

        // Enqueue another customer
        queue.enqueue("Customer D");

        // Display the updated queue
        queue.displayQueue();

        // Dequeue (serve) two more customers
        System.out.println("Serving: " + queue.dequeue());
        System.out.println("Serving: " + queue.dequeue());

        // Display the queue after more customers are served
        queue.displayQueue();
    }
}


class queue {
    private Node front, rear; // front points to the first node, rear points to the last node

    public queue() {
        this.front = this.rear = null;
    }

    // Enqueue (Add element to the queue)
    public void enqueue(String data) {
        Node newNode = new Node(data);

        // If queue is empty, both front and rear will point to the new node
        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        // Otherwise, add the new node at the end and update the rear
        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Dequeue (Remove element from the queue)
    public String dequeue() {
        // If the queue is empty, return null
        if (this.front == null) {
            System.out.println("Queue is empty, no one to serve.");
            return null;
        }

        // Store the current front and move the front one step ahead
        Node temp = this.front;
        this.front = this.front.next;

        // If front becomes null, set rear to null as well
        if (this.front == null) {
            this.rear = null;
        }

        return temp.data; // return the removed node's data
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display the queue
    public void displayQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node temp = front;
        System.out.print("Current Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
class QueueList{
    Node front;
    Node rear;

    QueueList(){
        this.front = null;
        this.rear = null;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // Time Complexity: O(1)
    // Memory: O(1) per node (data + next pointer)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        System.out.println(data + " enqueued");
    }

    // Time Complexity: O(1)
    // Memory: O(1)
    public int dequeue(){
        if(front == null){
            System.out.println("Queue is empty!");
            return -1;
        }
        int removed = front.data;
        if(front == rear) {
            front = rear = null;
            return removed;
        }
        front = front.next;
        return removed;
    }

    // Time Complexity: O(1)
    // Memory: O(1)
    public int peek(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        return front.data;
    }

    // Time Complexity: O(n) - traverse entire queue
    // Memory: O(1)
    public int findMax(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int max = front.data;
        Node currNode = front;

        while(currNode != null){
            if(currNode.data > max){
                max = currNode.data;
            }
            currNode = currNode.next;
        }
        return max;
    }

    // Time Complexity: O(n) - traverse entire queue
    // Memory: O(1)
    public int findMin(){
        if(front == null){
            System.out.println("Queue is Empty");
            return -1;
        }
        int min = front.data;
        Node currNode = front;
        while(currNode != null){
            if(currNode.data < min){
                min = currNode.data;
            }
            currNode = currNode.next;
        }
        return min;
    }

    public void printQueue(){
        if(front == null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue Elements: ");
        Node currNode = front;
        while(currNode != null){
            System.out.print(currNode.data +" ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}

public class Queue_LinkedList {
    public static void main(String[] args) {
        QueueList queueList = new QueueList();
        queueList.enqueue(10);
        queueList.enqueue(20);
        queueList.enqueue(30);
        queueList.enqueue(40);

        queueList.printQueue();

        System.out.println("Removed: " +queueList.dequeue());
        System.out.println("Front Element: " +queueList.peek());
        System.out.println("Maximum: " +queueList.findMax());
        System.out.println("Minimum: " +queueList.findMin());
    }
}

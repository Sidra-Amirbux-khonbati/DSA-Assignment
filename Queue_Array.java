class Queue_Arr {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    Queue_Arr(int initialSize) {
        size = initialSize;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void enqueue(int value) {
        if (rear == size - 1) {
            resize();
        }

        if (front == -1) {
            front = 0;
        }

        queue[++rear] = value;
        System.out.println("Enqueued: " + value);
    }

    public void resize() {
        int newSize = size * 2;
        int[] newQueue = new int[newSize];

        for (int i = 0; i <= rear; i++) {
            newQueue[i] = queue[i];
        }

        queue = newQueue;
        size = newSize;

        System.out.println("Queue resized to size: " + size);
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        int removed = queue[front++];
        System.out.println("Dequeued: " + removed);
        return removed;
    }

    public int peek() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }

        return queue[front];
    }

    public void display() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public int findMin() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int min = queue[front];
        for (int i = front + 1; i <= rear; i++) {
            if (queue[i] < min) {
                min = queue[i];
            }
        }
        return min;
    }

    public int findMax() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int max = queue[front];
        for (int i = front + 1; i <= rear; i++) {
            if (queue[i] > max) {
                max = queue[i];
            }
        }
        return max;
    }
}
class Queue_Array{
    public static void main(String[] args) {

        Queue_Arr  q = new Queue_Arr(3);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);

        q.display();

        System.out.println("Peek element: " + q.peek());

        q.dequeue();
        q.display();

        System.out.println("Minimum element: " + q.findMin());
        System.out.println("Maximum element: " + q.findMax());
    }
}
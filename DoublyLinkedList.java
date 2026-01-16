class DoublyList{
    Node head;
    Node tail;

    DoublyList(){
        this.head = null;
        this.tail = null;
    }

    class Node{
        int data;
        Node next;
        Node previous;

        Node(int data){
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        head = head.next;
        head.previous = null;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        if(head == tail){
            head = tail = null;
            return;
        }
        tail = tail.previous;
        tail.next = null;
    }

    public void deleteByValue(int value){
        if(head == null){
            System.out.println("List is empty!");
            return;
        }
        Node currNode = head;
        if(currNode.data == value){
            head = head.next;
            if(head != null){
                head.previous = null;
            }
            System.out.println(value +" deleted");
            return;
        }

        while(currNode != null && currNode.data != value){
            currNode = currNode.next;
        }

        if(currNode == null){
            System.out.println("value not found");
            return;
        }

        if(currNode.next == null){
            tail = currNode.previous;
        }

        if(currNode.next != null){
            currNode.next.previous = currNode.previous;
        }

        if(currNode.previous != null){
            currNode.previous.next = currNode.next;
        }

        System.out.println(value +" deleted");
    }

    public void deleteAfterValue(int value){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        while(currNode != null && currNode.data != value){
            currNode = currNode.next;
        }

        if(currNode == null){
            System.out.println("Value not found");
            return;
        }
        if(currNode.next == null){
            System.out.println("No next node exists!");
            return;
        }

        System.out.println(currNode.data + " deleted!");

        if(currNode.next.next == null){
            currNode.next = null;
            tail = currNode;
            return;
        }

        currNode.next = currNode.next.next;
        currNode.next.previous = currNode;
    }

    public void deleteBeforeValue(int value){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }

        Node currNode = head;
        while(currNode != null && currNode.data != value){
            currNode = currNode.next;
        }

        if(currNode == null){
            System.out.println("Value not exists!");
            return;
        }
        if(currNode.previous == null){
            System.out.println("No previous Node exists!");
            return;
        }
        System.out.println(currNode.data + " deleted");

        if(currNode.previous.previous == null){
            head = currNode;
            currNode.previous = null;
            return;
        }

        currNode.previous = currNode.previous.previous;
        currNode.previous.next= currNode;
    }

    public void FindMin(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        Node currNode = head;
        int min = head.data;

        while(currNode != null){
            if(currNode.data < min) {
                min = currNode.data;
            }
            currNode = currNode.next;
        }
        System.out.println("Minimum Value: " +min);
    }

    public void findMax(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }
        Node currNode = head;
        int max = head.data;
        while(currNode != null){
            if(currNode.data > max){
                max = currNode.data;
            }
            currNode = currNode.next;
        }
        System.out.println("Maximum Value: " +max);
    }
    public void printForward(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        System.out.print("PrintForward: ");
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data +"-> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public void printBackward(){
        if(head == null){
            System.out.println("List is Empty!");
            return;
        }
        System.out.print("PrintBackward: ");
        Node currNode = tail;
        while(currNode != null){
            System.out.print(currNode.data +"-> ");
            currNode = currNode.previous;
        }
        System.out.println("Null");
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DoublyList doublyList = new DoublyList();
        doublyList.addFirst(20);
        doublyList.addFirst(10);
        doublyList.addLast(30);
        doublyList.addLast(40);
        doublyList.addLast(5);
        doublyList.addLast(50);
        doublyList.printForward();
        doublyList.printBackward();
        System.out.println("After delete first & last Node!");
        doublyList.deleteFirst();
        doublyList.deleteLast();
        doublyList.printForward();
        doublyList.printBackward();
        doublyList.deleteByValue(20);
        doublyList.printForward();
        doublyList.deleteBeforeValue(30);
        doublyList.deleteAfterValue(20);
        doublyList.FindMin();
        doublyList.findMax();
    }
}

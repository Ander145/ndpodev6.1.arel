package myjavaproject;
//
//public class odev6 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        head = null;
        tail = null;
    }

    // Method to insert a new node at the end of the circular linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    // Method to display the elements of the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("Circular Linked List is empty");
            return;
        }
        Node current = head;
        System.out.println("Nodes of the Circular Linked List:");
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);
    }
}

public class odev6 {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Inserting elements into the circular linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        // Displaying the elements of the circular linked list
        list.display();
    }
}

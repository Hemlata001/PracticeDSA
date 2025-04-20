package LinkedList;

public class Insertion {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Method to insert a node at the end
    public void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // If the linked list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        // If linked list is not empty
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to display the linked list
    public void displayll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Insertion llist = new Insertion();

        llist.insertAtEnd(2);
        llist.insertAtEnd(4);
        llist.insertAtEnd(6);

        System.out.println("Before insertion of 10:");
        llist.displayll();
        System.out.println();

        llist.insertAtEnd(10);
        System.out.println("After insertion of 10:");
        llist.displayll();
        System.out.println();
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
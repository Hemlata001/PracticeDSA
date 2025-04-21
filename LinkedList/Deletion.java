package LinkedList;

public class Deletion {
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

    // Method to insert at the beginning
    public void insertAtBeigninig(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head = newNode;
    }     //O(n)


    //Method insertion of a node after any node.
    public void insertAfter(Node prev_node, int newData){
        if(prev_node == null){
            System.out.println("The previous node cannot contain null values");
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }
    // Method to display the linked list
    public void displayll() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    void deleteNode(int position){
        if(head  == null){
            return;
        }
        Node temp = head;
        if(position == 0){
            head = temp.next;
            return;
        }
        for(int i = 0 ; temp != null && i<position-1;i++){
            temp = temp.next;
        }

        if(temp == null && temp.next == null){
            return;
        }
        temp.next = temp.next.next;
    }

    public static void main(String[] args) {
        Deletion llist = new Deletion();

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

        System.out.println("Before insertion of 8:");
        llist.displayll();
        System.out.println();

        llist.insertAtBeigninig(8);
        System.out.println("After insertion of 8:");
        llist.displayll();
        System.out.println();

        System.out.println("Before insertion of 12:");
        llist.displayll();
        System.out.println();

        llist.insertAfter(llist.head.next.next,12);
        System.out.println("After insertion of 12:");
        llist.displayll();
        System.out.println();

        System.out.println("Before deletion:");
        llist.displayll();
        System.out.println();

        llist.deleteNode(3);
        System.out.println("After insertion:");
        llist.displayll();
        System.out.println();





    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
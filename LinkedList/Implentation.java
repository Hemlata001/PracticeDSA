package LinkedList;

public class Implentation
{
    public static class Node
    {
        int data ;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class Linkedlists {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
        public static void main(String[] args)
        {
            Linkedlists ll = new Linkedlists();
            ll.insertAtEnd(4);
            ll.insertAtEnd(5);
            ll.display();

        }

}


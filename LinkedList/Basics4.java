package LinkedList;

public class Basics4
{
    public static void display(Node head)
    {
        if(head == null)
        {
            return;
        }
        System.out.println(head.data);
        System.out.println(head.next);
    }
    public static void displayr(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.next);
        System.out.println(head.data);
    }
        public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    public static void main(String[] args)
    {
        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(1);
        Node d = new Node(3);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        display(a);
        System.out.println();
        displayr(a);
    }
}


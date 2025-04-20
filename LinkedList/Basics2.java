package LinkedList;

public class Basics2
{
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
        for(int i = 0;i<=4;i++) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}

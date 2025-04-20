package LinkedList;

public class Basics1
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
        Node a =  new Node(5);
        Node b = new Node(3);
        Node c = new Node(2);
        Node d = new Node(1);
        Node e = new Node(6);
        a.next = b;//5->3 2 1 6
        b.next = c; // 5->3->2 1 6
        c.next = d; // 5->3->2->1 6
        d.next = e; // 5->3->2->1->6

    }
}

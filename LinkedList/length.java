package LinkedList;

public class length
{
    public static class Node
    {
        int data;
        Node next ;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static int length(Node head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args)
    {
        Node a = new Node(5);
        Node b =new Node(3);
        Node c = new Node(4);
        Node d = new Node(1);
        Node e = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node temp = a;
        while(temp!=null)
        {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println( "Length: "+ length(a));
    }
}

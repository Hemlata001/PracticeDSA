package LinkedList;

public class Basics
{
    public static class Node
    {
        int data;
        Node next;
    }

    public static void main(String[] args) {
        Node x = new Node();
        System.out.println(x);
        System.out.println(x.next);
        System.out.println(x.data);
    }
}

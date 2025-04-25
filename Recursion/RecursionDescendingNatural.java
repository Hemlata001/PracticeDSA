package Recursion;

import java.util.Scanner;

public class RecursionDescendingNatural
{
    public static void RecursionDesendingNaturalNumber(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        RecursionDesendingNaturalNumber(n-1);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Print the "+ n + " natural numbers");
        RecursionDesendingNaturalNumber(n);
    }
}

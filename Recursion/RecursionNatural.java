package Recursion;
import java.util.Scanner;
public class RecursionNatural
{
    public static void RecursionNaturalNumber(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }
        RecursionNaturalNumber(n-1);
        System.out.println(n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.println("Print the "+ n + " natural numbers");
        RecursionNaturalNumber(n);
    }
}

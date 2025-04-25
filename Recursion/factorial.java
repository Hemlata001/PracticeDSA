package Recursion;
import java.util.Scanner;
public class factorial
{
    static int factorialR(int n)
    {
        if(n==0){
            return 1;
        }
        int smallAns = factorialR(n-1);
        int ans = n * smallAns;
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        System.out.println(factorialR(n));
    }
}

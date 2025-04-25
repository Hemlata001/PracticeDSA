package Recursion;
import java.util.Scanner;
public class fibanocci
{
    public static int fibanocciR(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        int smallAns1 = fibanocciR(n-1);
        int smallAns2 = fibanocciR(n-2);
        int ans = smallAns1 + smallAns2;
        return ans;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0;i<=n;i++)
        {
          System.out.println(fibanocciR(i));
        }
    }
}

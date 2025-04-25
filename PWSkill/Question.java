package PWSkill;
import java.util.Scanner;
public class Question 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for(int i = 1;i<n;i++)
        {
            if (i%3==0&&i%5==0)
            {
                System.out.print("FIZZBUZZ");
            }
            else if(i%3==0)
            {
                System.out.print("FIZZ");
            }
            else if (i%5==0)
            {
                System.out.print("BUZZ");
            }
            else
            {
                System.out.print(i);
            }
            System.out.print(","+" ");
        }
    }
}

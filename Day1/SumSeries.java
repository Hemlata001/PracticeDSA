import java.util.Scanner;
public class SumSeries{
    public static int SumOfSeries(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + SumOfSeries(n/10);
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The Sum of Series is : "+SumOfSeries(n));
        
    }
}
// Time Complexity : O(n)
// Space Complexity : O(n)

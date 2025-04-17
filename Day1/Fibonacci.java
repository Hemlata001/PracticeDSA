import java.util.Scanner;
public class Fibonacci{
    public static int fibonacciSeries(int n){
        if(n == 1 || n == 0){
            return n;
        }else{
            int fib = fibonacciSeries(n-1) + fibonacciSeries(n-2);
            return fib;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number in fibonacci");
        int n = sc.nextInt();
        System.out.println("The fibonacci is : "+fibonacciSeries(n));
        
    }
}
// Time Complexity : O(2^n)
// Space Complexity : O(n)

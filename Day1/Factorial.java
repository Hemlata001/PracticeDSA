import java.util.Scanner;
public class Factorial{
    public static int factoralNumber(int n){
        if(n == 1 || n == 0){
            return 1;
        }else{
            int fact = n*factoralNumber(n-1);
            return fact;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The factorial is : "+factoralNumber(n));
        
    }
}
// Time complexity : O(n)
// Space complexity : O(n)

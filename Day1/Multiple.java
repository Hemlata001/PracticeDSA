import java.util.Scanner;
public class Multiples{
    public static void printMultiples(int num, int k){
        if(k == 1){
            System.out.println(num);
            return;
        }else{
            printMultiples(num,k-1);
            System.out.println(num*k);
        }
       
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        printMultiples(num,5);
        System.out.println();
        
    }
}
// Time Complexity :O(K)
// Space Complexity :O(K)

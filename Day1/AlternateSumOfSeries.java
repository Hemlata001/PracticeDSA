import java.util.Scanner;
public class AlternateSumSeries{
    public static int AlternateSumOfSeries(int num){
        if(num == 0){
            return 0;
        }
        if(num%2==0){
            return AlternateSumOfSeries(num-1)-num;
        }else{
            return AlternateSumOfSeries(num-1)+num;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("The Alternate Sum of Series is : "+AlternateSumOfSeries(n));
        
    }
}
// Time Complexity :O(n)
// Space COmplexity :O(n)

package Day1;
import java.util.*;
public class MissingNumber {
    public static int naturalnumber(int[] num){
        int n = num.length+1;
        int natural = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0;i<n-1;i++){
            sum+=num[i];
        }
        return natural - sum;
    }
    public static void main(String[] args) {
        int[] num = {1,2,3,5};
        System.out.println("Array : " + Arrays.toString(num));
        System.out.println("Missing number: " + naturalnumber(num));
    }
}
// time Complexity : O(n)
//Space Complexity : O(n)

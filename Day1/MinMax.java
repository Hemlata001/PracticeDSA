package Day1;
import java.util.*;
public class MinMax {
    public static int minimum(int[] arr){         // O(n)
        int n = arr.length;
        int mini = Integer.MAX_VALUE;
        for(int i = 0;i<n;i++){
            if(mini>arr[i]){
                mini = arr[i];
            }
        }
        return mini;
    }
    public static int maximum(int[] arr){            // O(n)
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i  = 0;i<n;i++){
            if(maxi<arr[i]){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Array : "+ Arrays.toString(arr));
        System.out.println("Minimum in this Array : " + minimum(arr));
        System.out.println("Maximum in this Array : " + maximum(arr));
    }
}
// Time complexity : O(n)
// Space Complexity : O(n)

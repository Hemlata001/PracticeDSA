package InterviewBit_MicroSoft;
import java.util.*;
public class MaxSubArray
{
    public static int maxSub_Brute(int[] arr){
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i = 0;i<n;i++){
            int start = i;
            for(int j = i+1;j<n;j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k < end; k++) {
                    currSum += arr[i];
                    if (maxSum < currSum) {
                        maxSum = currSum;
                    }
                }
            }

        }
        return maxSum;
    }
    // Time Complexity : O(n^3)
    // Space Complexity : O(1)
    public static int maxSub_Prefix(int[] arr){
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for(int i = 1;i<n;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i = 0;i<n;i++){
            int start = i;
            for(int j = i+1;j<n;j++){
                int end = j;

                currSum = start == 0 ? prefix[end] :prefix[end]-prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    //  Time Complexity : O(n^2)
    // Space Complexity : O(1)
    public static int maxSum_kadanes(int[] arr){
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            currSum = currSum + arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
            }
        }
        return maxSum;
    }
    // Time Complexity : O(n)
    // Space Complexity : O(1)
    public static void main(String[] args){
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println("Maximum SubArray with the help of BruteForce : "+maxSub_Brute(arr));
        System.out.println("Maximum SubArray with the help of prefix : "+maxSub_Prefix(arr));
        System.out.println("Maximum SubArray with the help of Kadanes : "+maxSum_kadanes(arr));

    }
}

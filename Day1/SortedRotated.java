package Day1;
import java.util.Arrays;

public class SortedRotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int peak = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                peak++;
            }
        }
        return peak <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {3,4,1,2};
        System.out.println("Array : "+ Arrays.toString(nums));
        SortedRotated solution = new SortedRotated();
        System.out.println("Checking if the Array is Sorted or Rotated: " + solution.check(nums));
    }
}
// Time Complexity : O(n)
//Space Complexity : O(1)

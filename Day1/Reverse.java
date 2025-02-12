package Day1;
import java.util.Arrays;
public class Reverse {
    public static void reverse(int[] arr){
        int n = arr.length-1;
        for(int i = 0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Before reversing: " + Arrays.toString(arr));
        reverse(arr);
        System.out.println("Before reversing: " + Arrays.toString(arr));
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)

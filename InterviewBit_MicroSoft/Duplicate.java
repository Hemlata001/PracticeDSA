package InterviewBit_MicroSoft;
import java.util.*;
public class Duplicate
{
    public static int findDuplicatePresent(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            Arrays.sort(arr);
            if(arr[i]==arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,5,8,4};
        System.out.println("Duplicate present in an Array : "+findDuplicatePresent(arr));

    }
}
// Time Complexity : O(nlogn)
// Space Complexity :O(1)

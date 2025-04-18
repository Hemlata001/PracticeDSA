import java.util.Scanner;
public class BinarySearchRecursion {
    public static int binarySearch(int[]arr, int low,int high,int x){
        int result = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(arr[mid]==x){
                return mid;
            }else if(arr[mid]<x){
                return binarySearch(arr,mid+1,high,x);
            }else{
                return binarySearch(arr,low,mid-1,x);
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of element in arr : ");
        int n = sc.nextInt();
        System.out.println("Enter array: ");
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target element : ");
        int x = sc.nextInt();
        int low = 0;
        int high = arr.length -1;
        int result = binarySearch(arr,low,high,x);
        System.out.println("The array element is at : "+result);
    }
}
// Time Complexity : O(log n)
// Space Complexity : O(n)

package Searching;

public class LinearSearch
{
    public static int linearSearch(int[] arr,int key){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {18,12,9,14,77,50};
        int key = 77;
        System.out.println(linearSearch(arr,key));
    }
}
// Time complexity : O(n)
// Space complexity : O(1)

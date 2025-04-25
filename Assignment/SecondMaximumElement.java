package Assignment;

public class SecondMaximumElement
{
    public static int maxElement(int[] arr){
        int max = Integer.MIN_VALUE;
        int n  = arr.length;;
        for(int i = 0;i<n;i++){
            while(max<arr[i]){
                max = arr[i];
            }
        }
        int second = max;
        for(int i = 0;i<n;i++){
            while(second<arr[i]){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        System.out.println("Second maximum : "+ maxElement(arr));
    }
}

package Assignment;

public class MaximumElement {
    public static void main(String[] args) {
        int[] arr = {34,21,54,65,43};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            while(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum element in the array : " + max);
    }
}

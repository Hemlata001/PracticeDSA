package Assignment;

public class traverseEvenElement
{
    public static void main(String[] args) {
        int[] arr = {4,3,6,7,1};
        for(int i = 0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }
}

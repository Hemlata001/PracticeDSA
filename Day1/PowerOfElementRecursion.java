import java.util.Scanner;
public class PowerOfElementRecursion {
    public static long powerOfElement(long a , long b){
        if(b==1){
            return a ;
        }
        else{
            long result = powerOfElement(a,b/2);
            long finalResult = result * result;
            if(b%2 == 0){
                return finalResult;
            }else{
                return finalResult*a;
            }
        }
        
    }
    public static void main(String[] args) {
       long a = 2;
       long b = 32;
       long result = powerOfElement(a,b);
       System.out.println("Power of element : "+result);
    }
}
// Time complexity :O(log b)
//Space complexity :O(n)

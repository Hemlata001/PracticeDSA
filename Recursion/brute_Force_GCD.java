package Recursion;
import java.util.*;

public class brute_Force_GCD {
    public static int gcd(int x, int y) {
        int minimum = Math.min(x, y);
        for (int i = minimum; i >= 1; i--) {
            if (x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1; // If no greater common divisor is found, return 1
    }
    public static int long_divisor_approach(int x,int y){
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static int gcd_euclid(int x , int y){
        if(y==0){
            return x;
        }
        return gcd_euclid(y,x%y);
    }
    public static int lcm(int x,int y){
        int lcm1 = x*y/gcd_euclid(16,12);
        return lcm1;
    }

    public static void main(String[] args) {
        int x = 16;
        int y = 12;
        int gcdValue = gcd(x, y);
        int gcdValue_long = long_divisor_approach(x,y);
        int gcdValue_euclid = gcd_euclid(x,y);
        System.out.println("The GCD of " + x + " and " + y + " is: " + gcdValue);
        System.out.println("The GCD of " + x + " and " + y + " is: " + gcdValue_long);
        System.out.println("The GCD of " + x + " and " + y + " is: " + gcdValue_euclid);
        System.out.println(lcm(16,12));

    }
}

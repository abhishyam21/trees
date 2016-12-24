import java.util.Scanner;

/**
 * Created by Rachana Rao on 2/11/2016.
 */
public class Test {
    public static void main(String[] args) {
        int a=16,b=10;
        System.out.println(gcd(a,b));
    }

    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }else {
            gcd(b,a%b);
            System.out.println("a=="+a+"b=="+b);
        }
        return 0;
    }
}

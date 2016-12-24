import java.util.Scanner;

/**
 * Created by Rachana Rao on 2/27/2016.
 */
public class primenumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for (int i = 0; i < n; i++) {
            boolean flag= true;
            int a = Integer.parseInt(sc.next());
            int m = Integer.parseInt(sc.next());
            if(a>=m)
                System.out.println("NO");
            else {
                for (int j = 1; j <= m; j++) {
                    long num = j%m;
                    if((num * num) == a){
                        System.out.println("YES");
                        flag =false;
                        break;
                    }
                }
                if(flag)
                    System.out.println("NO");
            }


        }
    }
}

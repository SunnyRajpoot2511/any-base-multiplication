import java.util.*;

public class BTA {

    public static Scanner scn = new Scanner(System.in);

    public static int binToAb(int n, int b) {
        int ans = 00;
        int pow = 1;

        while(n != 0) {
            int r = n % b;
            n /= b;

            ans += r * pow;
            pow *= 2;
        }
        return ans;
    }
    public static void main(String[]args) {
        int bin = binToAb(scn.nextInt(), scn.nextInt());
        System.out.print(bin);
    }
}



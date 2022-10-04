import java.util.*;

public class AbMultiply {

    public static Scanner scn = new Scanner(System.in);

    public static int AbAddition(int n1, int n2, int b) {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n1 != 0 || n2 != 0 || carry != 0) {
            int sum = carry + (n1 % 10) + (n2 % 10);
            n1 /= 10;
            n2 /= 10;

            int digit = sum % b;
            carry = sum / b;

            ans += digit * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int singleDigitMultiply(int n1, int d2, int b) {
        int ans = 0;
        int pow = 1;
        int carry = 0;

        while (n1 != 0 || carry != 0) {
            int d1 = n1 % 10;
            n1 /= 10;

            int d = carry + (d1 * d2);
            int digit = d % b;
            carry = d / b;

            ans += digit * pow;
            pow *= 10;
        }
        return ans;
    }

    public static int multiplication(int n1, int n2, int b) {
        int ans = 0;
        int pow = 1;

        while (n2 != 0) {
            int d2 = n2 % 10;
            n2 /= 10;

            int prod = singleDigitMultiply(n1, d2, b) * pow;
            ans = AbAddition(ans, prod, b);
            pow *= 10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int b = scn.nextInt();
        int product = multiplication(n1, n2, b);
        System.out.print(product);
    }
}
 
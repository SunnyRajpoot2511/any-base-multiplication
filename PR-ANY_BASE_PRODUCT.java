import java.util.*;

public class DTB {
    
    public static Scanner scn = new Scanner (System.in);

    public static int binReturn (int n) {
        int r = 0;
        int b = 2; 
        int pow = 1;
        int ans = 0;

        while (n != 0) {
            r = n % b;
            n = n / b;

            ans += r * pow;
            pow = pow * 10;
        }
        return ans;
    }
    
    public static void main (String[] args) {
        int n = binReturn(scn.nextInt());
        System.out.print(n);
    }
}









// import java.util.Scanner;

// public class DTB {

//     public static Scanner scn = new Scanner (System.in);

//     public static int[] input2(int n) {
//         int[] arr = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scn.nextInt();
//         }
//         return arr;
//     }

//     public static int decToBin (int n) {
//         int r = 0;
//         int b = 2;
//         int ans = 0;
//         int pow = 1;

//         while (n != 0) {
//             r = n % b;
//             n = n / b;

//             ans += r * pow;
//             pow = pow * 10;
//         }
//         return ans; 
//     }

//     public static void main(String[] args) {
//         // int n = scn.nextInt();
//         int n = decToBin(scn.nextInt());
//         System.out.print(n);;
//     }
// }
 

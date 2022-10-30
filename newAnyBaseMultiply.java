import java.util.*;

public class rotateArray2 {

    public static Scanner scn = new Scanner(System.in);

    public static int[] input2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 00; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static int[] swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        return arr;
    }

    public static void revArray(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);

            i++;
            j--;
        }
    }

    public static void rotate2(int[] arr, int r) {
        int n = arr.length;
        r = r % n;
        if (r < 0) {
            r = r + n;
        }

        revArray(arr, 0, n - 1);
        revArray(arr, 0, r - 1);
        revArray(arr, r, n - 1);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = input2(n);
        int r = scn.nextInt();
        rotate2(arr, r);
        display(arr);
    }
}

import java.util.*;

public class stateOfWakanda {
    
    public static Scanner scn = new Scanner(System.in);

    public static void input(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void WakandaState (int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.println(arr[i][j]);
                }
            }
            else {
                for (int i = n-1; i >= 0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        input(arr);
        WakandaState(arr);
    }
}
import java.util.Scanner;

public class DTB {

	public static Scanner scanner = new Scanner(System.in);

	public static int binReturn(int number) {
		int remainder = 0;
		int b = 2;
		int power = 1;
		int answer = 0;

		while (number != 0) {
			remainder = number % b;
			number = number / b;

			answer += remainder * power;
			power = power * 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = binReturn(scanner.nextInt());
		System.out.print(n);
		scanner.close();
	}
}

//import java.util.Scanner;
//
//public class DTB {
//	public static Scanner scanner = new Scanner(System.in);
//
//	public static int[] input2(int n) {
//		int[] arr = new int[n];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = scanner.nextInt();
//		}
//		return arr;
//	}
//
//	public static int decToBin(int number) {
//		int remainder = 0;
//		int b = 2;
//		int answer = 0;
//		int power = 1;
//		while (number != 0) {
//			remainder = number % b;
//			number = number / b;
//			answer += remainder * power;
//			power = power * 10;
//		}
//		return answer;
//	}
//
//	public static void main(String[] args) {
//		// int n = scn.nextInt();
//		int n = decToBin(scanner.nextInt());
//		System.out.print(n);
//
//		scanner.close();
//	}
//}

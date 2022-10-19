import java.util.Scanner;

public class AbMultiply {

	public static Scanner scanner = new Scanner(System.in);

	public static int AbAddition(int n1, int n2, int b) {
		int answer = 0;
		int power = 1;
		int carry = 0;

		while (n1 != 0 || n2 != 0 || carry != 0) {
			int sum = carry + (n1 % 10) + (n2 % 10);
			n1 /= 10;
			n2 /= 10;

			int digit = sum % b;
			carry = sum / b;

			answer += digit * power;
			power *= 10;
		}
		return answer;
	}

	public static int singleDigitMultiply(int n1, int d2, int b) {
		int answer = 0;
		int power = 1;
		int carry = 0;

		while (n1 != 0 || carry != 0) {
			int remainder = n1 % 10;
			n1 /= 10;

			int d = carry + (remainder * d2);
			int digit = d % b;
			carry = d / b;

			answer += digit * power;
			power *= 10;
		}
		return answer;
	}

	public static int multiplication(int n1, int n2, int b) {
		int answer = 0;
		int power = 1;

		while (n2 != 0) {
			int remainder = n2 % 10;
			n2 /= 10;

			int product = singleDigitMultiply(n1, remainder, b) * power;
			answer = AbAddition(answer, product, b);
			power *= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int b = scanner.nextInt();
		
		int product = multiplication(n1, n2, b);
		
		System.out.print(product);
	}
}

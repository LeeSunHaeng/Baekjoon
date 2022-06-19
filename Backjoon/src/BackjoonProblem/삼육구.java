package BackjoonProblem;

import java.util.Scanner;

public class 삼육구 {

	static int count = 0;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		game(n);
		System.out.println(count);
	}

	public static void game(int result) {

		while (true) {
			if (result % 10 == 3 || result % 10 == 6 || result % 10 == 9) {
				count++;
			}

			if (result / 10 == 0) {
				break;
			}
			result = result / 10;
		}

	}
}

package BackjoonProblem;

import java.util.Scanner;

public class fibonacci {
	static int zeroCount = 0;
	static int oneCount = 0;

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int fiboNum = scan.nextInt();
		
		System.out.println(fibonacci(fiboNum));
		System.out.println(zeroCount);
		System.out.println(oneCount);

	}

static Integer fibonacci(int fiboNum) {
	if(fiboNum == 0) {
		zeroCount++;
		return 0;
	} else if(fiboNum == 1) {
		oneCount++;
		return 1;
	}else {
		return fibonacci(fiboNum-1)+fibonacci(fiboNum-2);
	}
	
}

}



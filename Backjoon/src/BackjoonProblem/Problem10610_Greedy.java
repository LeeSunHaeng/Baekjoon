package BackjoonProblem;

import java.io.*;

public class Problem10610_Greedy {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		//입력받은 N을 자릿수로 쪼개서 배열에 저장
		int [] numArr = new int[num.length()];
		
		//3의 배수는 각각의 자릿수를 다 합하면 3의배수이다. <- 이것을 체크하기 위해 각각의 자릿수의 합을 구하기 위한 변수
		int sum = 0;
		
		//0~9 각각 몇개씩 포함되어있는지 체크하기 위한 배열
		int [] numCount = new int [10];
		
		//N쪼개서 배열에 넣기 및 0~9갯수 체크, 자릿수의 합 구하기
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = num.charAt(i)-48;
			numCount[numArr[i]]++;
			sum += numArr[i];
		}
		
		StringBuilder sb = new StringBuilder();
		//30의 배수이기 위한 조건
		//1. 1의 자릿수가 0이어야함
		//2. 각 자릿수의 합이 3의 배수여아함
		//3. 30보다 커야함
		if(num.contains("0") && sum%3 == 0 && Integer.parseInt(num) >= 30) {
			//0~9중 가장 큰 9부터 sb에 붙여줌
			for(int i = 9; i>=0; i--) {
				while(numCount[i]>0) {
					sb.append(i);
					numCount[i]--;
				}
			}
			System.out.println(sb.toString());
		}else {
			System.out.println("-1");
		}

	}

}

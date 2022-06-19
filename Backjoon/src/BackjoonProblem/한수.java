package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
public class 한수{
	 
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print(arithmetic_sequence(Integer.parseInt(br.readLine())));
			
		}
	 
		public static int arithmetic_sequence(int num) {
			int cnt = 0; // 한수 카운팅
	 
			if (num < 100) {
				return num;
			}
	 
			else {
				cnt = 99;
				for (int i = 100; i <= num; i++) {
					int hun = i / 100; // 백의 자릿수
					int ten = (i / 10) % 10; // 십의 자릿수
					int one = i % 10;
	 
					if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
						cnt++;
					}
				}
			}
	 
			return cnt;
		}
}
	        
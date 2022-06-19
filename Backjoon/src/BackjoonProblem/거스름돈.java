package BackjoonProblem;
import java.io.*;
public class 거스름돈 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		 int n =1000 - Integer.parseInt(br.readLine());
		 int [] money = {500,100,50,10,5,1};

		 int count = 0;

		 for(int i = 0; i<money.length; i++) {
			 if(n == 0) {
				 break;
			 }
			 count += n/money[i];
			 n = n%money[i];
		 }
		 
		 bw.write(count+"");
		 bw.flush();
	}

}

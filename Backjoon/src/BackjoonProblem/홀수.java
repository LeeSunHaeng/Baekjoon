package BackjoonProblem;
import java.io.*;
public class 홀수 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 int min = 999;
		 int sum = 0;
		 for(int i =0; i<7; i++) {
			 int a = Integer.parseInt(br.readLine());
			 if(a%2==1) {
				 sum += a;
				 if(a<min) {
					 min = a;
				 }
			 }
		 }
		 if(sum ==0) {
			 bw.write("-1");
		 }else {
			 bw.write(sum+"" +"\n");
			 bw.write(min+"");
		 }
		 bw.flush();
	}

}

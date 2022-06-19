package BackjoonProblem;
import java.io.*;
public class 전자레인지 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int second = Integer.parseInt(br.readLine());
		 int [] btn = {300,60,10};
		 int [] check = new int[3];
		 
		 if(second%10 !=0) {
			 bw.write("-1");
		 }
		 else {			 		
		 for(int i = 0; i<btn.length; i++) {
			 if(second == 0) {
				 break;
			 }
			 check[i] = second/btn[i];
			 second = second%btn[i];		
		 }
		 bw.write(check[0]+ " " + check[1]+ " " + check[2]+ " " );
		 }
		 
		 bw.flush();
	}

}

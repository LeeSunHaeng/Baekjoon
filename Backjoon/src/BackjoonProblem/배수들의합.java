package BackjoonProblem;
import java.io.*;
public class 배수들의합 {
	static int [] nums; 
	static int sum =0;
	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 String [] NM = br.readLine().split(" ");
		 int N = Integer.parseInt(NM[0]);
		 int M = Integer.parseInt(NM[1]);

		 
		nums = new int[M];
		String [] K = br.readLine().split(" ");
		 for(int i = 0; i<nums.length; i++) {
			 nums[i] = Integer.parseInt(K[i]);
		 }
		 for(int i= 1; i<=N; i++) {
			 for(int j=0; j<nums.length; j++) {
				 if(i%nums[j]==0){
					 sum+=i;
					 break;
				 }
			 }
		 }
		 bw.write(sum+"");
		 bw.close();
 
	}


}

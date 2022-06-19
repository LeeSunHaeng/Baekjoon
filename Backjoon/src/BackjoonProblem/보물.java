package BackjoonProblem;
import java.io.*;
import java.util.Arrays;
import java.util.Collections;
public class 보물 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int N = Integer.parseInt(br.readLine());
		 
		 Integer [] A = new Integer[N];
		 Integer [] B = new Integer[N];
		 String [] st1 = br.readLine().split(" ");
		 String [] st2 = br.readLine().split(" ");
		 
		 int sum = 0;
		 
		 for(int i = 0; i<st1.length; i++) {
			 A[i] = Integer.parseInt(st1[i]);
		 }
		 
		 for(int i = 0; i<st2.length; i++) {
			 B[i] = Integer.parseInt(st2[i]);
		 }
		 
		 Arrays.sort(A);
		 Arrays.sort(B,Collections.reverseOrder());
		 
		 for(int i = 0; i<N; i++) {
			 sum += A[i]*B[i];
		 }
		 
		 bw.write(sum+"");
		 bw.flush();
		 
		 
		 
		 

	}

}

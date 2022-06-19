package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
public class AB8 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		

		
		for(int i = 1; i<=T; i++) {
			String [] a = br.readLine().split(" ");
			int [] nums = {Integer.parseInt(a[0]), Integer.parseInt(a[1])};
			bw.write("Case #"+i+": "+nums[0]+" + "+nums[1] + " = ");
			bw.write( nums[0]+nums[1] + "\n");
		}
		bw.flush();
		
		

	}

}

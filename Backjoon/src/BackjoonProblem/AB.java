package BackjoonProblem;
import java.io.*;
public class AB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String [] nums = br.readLine().split(" ");
			int [] num = new int[2];
			num[0] = Integer.parseInt(nums[0]);
			num[1] = Integer.parseInt(nums[1]);
			bw.write(num[0]+num[1]+"");
			bw.flush();
		}
	}

}

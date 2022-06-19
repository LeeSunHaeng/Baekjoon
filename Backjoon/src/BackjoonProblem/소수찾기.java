package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
public class 소수찾기 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		ArrayList<Integer> list  = new ArrayList<Integer>();
		String [] nums = br.readLine().split(" ");
		
		int m = Integer.parseInt(nums[0]);
		int n = Integer.parseInt(nums[1]);
		
		for(int i = m; i<=n; i++) {
			int count = 0;
			for(int j = 1; j<=i/2; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				list.add(i);
			}
		}
		for(int i=0; i<list.size(); i++) {
			bw.write(list.get(i)+""+"\n");
		}
		bw.flush();
		
	}

}

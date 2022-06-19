package BackjoonProblem;

import java.io.*;
public class 주사위세개 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] nums =br.readLine().split(" ");
		int [] check = new int[7];
		int index = 0;

		
		for(int i =0; i<nums.length; i++) {
			check[Integer.parseInt(nums[i])]++;
		}
		
		for(int i =0; i<check.length; i++) {
			if(check[i] == 3) {
				index = i;
				break;
			}
			
			if(check[i] == 2) {
				index = i;
				break;
			}
			if(check[i] == 1) {
				index = i;

			}
			
		}
		if(check[index]==3) {
			bw.write(10000+index*1000+"");
		}else if(check[index]==2) {
			bw.write(1000+index*100+"");
		}else {
			bw.write(index*100+"");
		}
		bw.flush();
		

	}

}

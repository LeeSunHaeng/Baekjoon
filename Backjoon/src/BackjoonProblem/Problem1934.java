package BackjoonProblem;

import java.io.*;

public class Problem1934 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int [][] nums = new int[n][2];
		
		for(int i = 0; i<n; i++) {
			String temp = br.readLine();
			nums[i][0] = Integer.parseInt(temp.split(" ")[0]);
			nums[i][1] = Integer.parseInt(temp.split(" ")[1]);
		}
		int i = 0;
		int j = 2;
		
		
		while(i < n) {
			if(j % nums[i][0] == 0 && j % nums[i][1] == 0) {
			bw.write(j + "\n");
			j = 2;
			i++;
			}
			j++;
		}
		br.close();
		bw.close();
		
		
	}

}

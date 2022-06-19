package BackjoonProblem;
import java.io.*;
public class 수정렬하기 {

	public static void main(String[] args) throws IOException {
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 int N = Integer.parseInt(br.readLine());
		 int [] nums = new int[N];
		 
		 for(int i = 0; i<nums.length; i++) {
			 nums[i] = Integer.parseInt(br.readLine());
		 }
		 
		 for(int i = 0; i<nums.length-1; i++) {
			 int mins = nums[i];
			 for(int j = i+1; j<nums.length; j++) {
				 if(mins>nums[j]) {					 
					 nums[i] = nums[j];
					 nums[j] = mins;
					 mins = nums[i];
				 }
				 
			 }
		 }
		 for(int i = 0; i<nums.length; i++) {
			 bw.write(nums[i] + "" + "\n");
		 }
		 bw.flush();
	}

}

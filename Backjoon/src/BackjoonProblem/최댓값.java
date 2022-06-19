package BackjoonProblem;
import java.io.*;
public class 최댓값 {

	public static void main(String[] args) throws IOException{
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        int [] nums = new int[9];
	        
	         for(int i = 0; i<9; i++){
	             nums[i] = Integer.parseInt(br.readLine());
	         }
	        int max = nums[0];
	        int index = 0;
	        
	        for(int i = 0; i<nums.length; i++){
	            if(i!=0 && nums[i]>max){
	                max = nums[i];
	                index = i;
	            }
	        }
	        bw.write(max + "\n");
	        bw.write(String.valueOf(index+1));
	        bw.close();

	}

}

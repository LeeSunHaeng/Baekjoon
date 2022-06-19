package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class 로또 {
	static int [] list;
	static boolean[] blean;
	public static void main(String[] args) throws IOException{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 StringTokenizer st = new StringTokenizer(br.readLine()," ");
		 
		 while(true) {			
			 int N = Integer.parseInt(st.nextToken());
			 if(N == 0) {
				 break;
			 }
			 list = new int[N];
			 blean = new boolean[N];
			 int [] nums = new int [N];
			 for(int i  = 0; i<nums.length; i++) {
				 nums[i] = Integer.parseInt(st.nextToken());
			 }
			 lotto(nums,list,0,0,blean,N-6);
		 }
	}
	
	public static void lotto(int[]nums,int[] list,int index, int count, boolean[]blean, int fcount) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		if(count == 6) {
			for(int i = 0 ; i<6; i++) {
				bw.write(list[i]+" ");
			}
			bw.write("\n");
			bw.flush();
			return;
		}
		if(blean[index] == false && fcount !=0) {
			
			blean[index] = true;
			list[count] = nums[count];
			lotto(nums,list,index++,count++,blean,fcount);
			
			lotto(nums,list,index++,count,blean,fcount--);
			

		}else if(blean[count] == false && fcount ==0) {
			blean[index] = true;
			list[count] = nums[count];
			lotto(nums,list,index++,count++,blean,fcount);
		}
		
	}

}

package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
public class 모든순열 {

	static int N;
	
	static ArrayList<int[]> list = new ArrayList<>();
	static boolean [] B;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		int [] nums = new int [N];
		B = new boolean [N];
		
		for(int i = 1; i<=N; i++) {
			nums[i-1] = i;
		}
		int [] insert = new int[N];
		
		disc(nums,insert,0,0);
		System.out.println(list.size());
		/*
		 * for(int i = 0; i<list.size(); i++) { System.out.println(list.get(i)); }
		 */
		
	}
	
	public static void disc(int [] n, int [] insert,int ind, int cnt) {
		if(cnt==N){
			list.add(insert);
			return;
		}
		else{
		if(B[ind]==false){
			B[ind] = true;
			insert[cnt] = n[ind];
			disc(n,insert,(ind+1)%N,cnt+1);
			cnt += 1;
			if(cnt == N) {
				return;
			}
			cnt-= 1;
			B[ind] = false;
			insert[cnt]=0;
			disc(n,insert,(ind+1)%N,cnt);
		}else if( B[ind] = true){
			disc(n,insert,(ind+1)%N,cnt);
		}
		}
			
			
			
		
	}

}

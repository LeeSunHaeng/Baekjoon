package BackjoonProblem;

import java.io.*;
import java.util.StringTokenizer;



public class 숫자카드2_10816 {
	
	static int [] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		
		int [] Nnum = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<Nnum.length; i++) {
			Nnum[i] = Integer.parseInt(st.nextToken());
		}
		
		
		
		
		
		int M = Integer.parseInt(br.readLine());
		
		int [] Mnum = new int[M];	
		
		StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
		for(int i = 0; i<Mnum.length; i++) {
			Mnum[i] = Integer.parseInt(st2.nextToken());
		}
		
		
		
		
		check = new int[M];
		
		
		
		
		
		
		for(int i = 0; i<Mnum.length; i++) {
			
			for(int j = 0; j<Nnum.length; j++) {
				if(Mnum[i] == Nnum[j]) {
					check[i]++;
				}
			}
		}
		
		
		
		
		for(int i =0; i<check.length; i++) {
			bw.write(check[i]+ " ");		
		}
		bw.flush();
		

	}

}

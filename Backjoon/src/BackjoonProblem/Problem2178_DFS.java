package BackjoonProblem;

import java.io.*;

public class Problem2178_DFS {
	static int N;
	static int M;
	static int [][] map;
	static int [][] visit;
	//ÁÂÇ¥
	static int [] dn = {1,0,-1,0};
	static int [] dm = {0,1,0,-1};
	
	public static void main(String [] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] NM = br.readLine().split(" ");

		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		
		map = new int [N][M];
		visit = new int [N][M];
		
		for(int i = 0; i<N; i++) {
			String line = br.readLine();
			for(int j = 0; j<M; j++) {
				map[i][j] = Character.getNumericValue(line.charAt(j));
			}
		}
		dfs(0,0,1);
		System.out.println(visit[N-1][M-1]);

	}
	
	static public void dfs(int n, int m, int count) {
		if(visit[n][m] <= count && visit[n][m] != 0) {
			return;
		}
		visit[n][m] = count;
		
		for(int i = 0; i<4; i++) {
			int newn = n+dn[i];
			int newm = m+dm[i];
			
			if(newn < 0 || newn >= N || newm < 0 || newm >= M ) {
				continue;
			}
			if(map[newn][newm] != 0) {			
				dfs(newn, newm, count+1);
			}
			
		}
	}
}

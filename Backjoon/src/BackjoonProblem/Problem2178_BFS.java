package BackjoonProblem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2178_BFS {
	static int N;
	static int M;
	static int [][] map;
	static boolean [][] visit;
	//ÁÂÇ¥
	static int [] dn = {1,0,-1,0};
	static int [] dm = {0,1,0,-1};
	public static void main(String[] args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] NM = br.readLine().split(" ");

		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		
		map = new int [N][M];
		visit = new boolean [N][M];
		
		for(int i = 0; i<N; i++) {
			String line = br.readLine();
			for(int j = 0; j<M; j++) {
				map[i][j] = Character.getNumericValue(line.charAt(j));
			}
		}
		bfs(0,0);
		System.out.println(map[N-1][M-1]);

	}
	static public void bfs(int n, int m) {
		Queue<int []> q = new LinkedList<int[]>();
		int [] nm = {n,m};
		map[n][m] = 1;
		q.add(nm);
		
		while(!q.isEmpty()) {
			int [] nownm = q.poll();
			int nown = nownm[0];
			int nowm = nownm[1];
			visit[nown][nowm] = true;
			for(int i = 0; i<4; i++) {
				int newn = nown + dn[i];
				int newm = nowm + dm[i];
				
				if(newn < 0 || newn >= N || newm < 0 || newm >= M ) {
					continue;
				}
				if(map[newn][newm] != 0 && !visit[newn][newm]) {	
					int [] newnm = {newn, newm};
					map[newn][newm] = map[nown][nowm]+1;
					q.add(newnm);
				}
			}
		}
	}

	}



package BackjoonProblem;

import java.io.*;
import java.io.InputStream;

public class Problem10026 {
	
	//DFS

	static char [][] map;
	static boolean [][] visit;
	static int [] dx = {1, 0, -1, 0};
	static int [] dy = {0, -1, 0, 1};
	static int cnt = 0;
	static int blindCnt = 0;
	
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		visit = new boolean[n][n];		//Boolean 배열은 생성시 false로 초기화됨
		
		for(int i = 0 ; i < n; i++) {
			String line = br.readLine();
			for(int j = 0; j<n; j++) {
				map[i][j] = line.charAt(j);
			}
		}
		br.close();
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(!visit[i][j]) {
					dfs(i,j,n, map[i][j]);
					cnt++;
				}
				
			}
		}
		visit = new boolean[n][n];		//Boolean 배열은 생성시 false로 초기화됨
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(map[i][j] == 'G') {
					map[i][j] =  'R';
				}
			}
		}
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<n; j++) {
				if(!visit[i][j]) {
					dfs(i,j,n, map[i][j]);
					blindCnt++;
				}
				
			}
		}
		
		System.out.println(cnt + " " + blindCnt);
		

	}
	
	static public void dfs(int x, int y, int n, char color) {
		if(color != map[x][y]) {
			return;
		}
		if(visit[x][y] == true) {
			return;
		}else {
			visit[x][y] = true;
			for(int i = 0; i<4; i++) {
				int newx = x + dx[i];
				int newy = y + dy[i];
				if(newx >= n || newx < 0 || newy >= n || newy < 0) {
					continue;
				}else {
					dfs(newx, newy, n, map[x][y]);
				}
			}
			
		}
		
	}

}

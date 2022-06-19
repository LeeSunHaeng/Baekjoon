package BackjoonProblem;

import java.io.*;
import java.util.ArrayList;

public class Problem15683_BruteForce {
	
	//아직 못품.. 어렵다 ㅠ
	
	static String xy[];
	static String [][] room;
	static ArrayList<int[]> check = new ArrayList<int[]>();
	static int [] dx = {1,0,-1,0};
	static int [] dy = {0,-1,0,1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		xy = new String[2];
		xy = br.readLine().split(" ");
		room = new String[Integer.parseInt(xy[0])][Integer.parseInt(xy[1])];
		
		for(int i = 0; i<Integer.parseInt(xy[0]); i++) {
			String [] line = new String[Integer.parseInt(xy[1])];
			line = br.readLine().split(" ");
			for(int j = 0; j<Integer.parseInt(xy[1]); j++) {
				room[i][j] = line[j];
				if(room[i][j] == "1" ||room[i][j] == "2" ||room[i][j] == "3" ||room[i][j] == "4" ||room[i][j] == "5") {
					int [] sam = {i,j};
					check.add(sam);
				}
			}
		}
		
		
	}
	public static void search(String [][] room, int idx) {
		if(idx == check.size()) {
			return;
		}
		
		if(room[check.get(idx)[0]][check.get(idx)[1]].equals("1")) {
			for(int i = 0; i<4; i++) {
				int j = 1;
				while(true) {
					if(check.get(idx)[0]+dx[i]*j >= Integer.parseInt(xy[0]) || check.get(idx)[0]+dx[i]*j < 0
							|| check.get(idx)[1]+dy[i]*j >= Integer.parseInt(xy[1]) || check.get(idx)[1]+dy[i]*j <0 ) {
						search(room,idx+1);
						break;
					}
					
					if(room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("1")
					|| room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("2")
					|| room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("3")
					|| room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("4")
					|| room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("5"))
					{
						j++;
						continue;
						
					}
					if(room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j].equals("6")) {
						break;
					}
					
					room[check.get(idx)[0]+dx[i]*j][check.get(idx)[1]+dy[i]*j] = "#";
					j++;
			}
			}
			
		}
		else if(room[check.get(idx)[0]][check.get(idx)[1]].equals("2")) {
			
		}
		else if(room[check.get(idx)[0]][check.get(idx)[1]].equals("3")) {
			
		}
		else if(room[check.get(idx)[0]][check.get(idx)[1]].equals("4")) {
			
		}
		else if(room[check.get(idx)[0]][check.get(idx)[1]].equals("5")) {
			
		}
		
	}

}

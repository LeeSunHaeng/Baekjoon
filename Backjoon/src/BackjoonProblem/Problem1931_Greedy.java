package BackjoonProblem;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1931_Greedy {
	//Greedy 알고리즘 -> 탐욕법_가장 최선의 경우를 선택하는 방법론
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [][] time = new int[n][2];
		
		for(int i = 0 ;i<time.length; i++) {
			String [] temp = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(temp[0]);
			time[i][1] = Integer.parseInt(temp[1]);
		}
		
		//회의가 끝나는 시간 순으로 오름차순 정렬하고 동률일 경우에는 시작시간에 대해 오름차순으로 정렬한다
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
			}
		});
		//가장 빨리 끝나고 가장 일찍 시작하는 순으로 정렬해 놓았기 때문에,
		//회의 종료 시간보다 큰 다음 인덱스를 넣어주면서 카운트 하면 된다
		int out = 0;
		int count = 0;
		for(int i = 0; i < time.length; i++) {
			if(time[i][0] >= out) {
				out = time[i][1];
				count++;
			}
			
		}
		System.out.println(count);

	}

}

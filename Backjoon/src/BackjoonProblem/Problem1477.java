package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Problem1477 {
	//유사하게 나오지만 완벽한 정답이 나오지 않음.. 거리를 나누는 과정에서 +-1 하는 부분의 검증이 어려움.. 이분탐색 알고리즘 공부하자
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
		int nowRestNum = sc.nextInt();
		int addRestNum = sc.nextInt();
		int loadLen = sc.nextInt();
		
		ArrayList<Integer> RestPosition = new ArrayList<Integer>();
		ArrayList<Integer> RestDistance = new ArrayList<Integer>();
		
		RestPosition.add(0);
		RestPosition.add(loadLen);
		for(int i = 0; i<nowRestNum; i++) {
			RestPosition.add(sc.nextInt());
		}
		Collections.sort(RestPosition);
		
		for(int i = 1; i<RestPosition.size(); i++) {
			RestDistance.add(RestPosition.get(i) - RestPosition.get(i-1));
		}
		Collections.sort(RestDistance);
		
		int i = 2;
		int j = 0;
		
		while(j < addRestNum) {
			// 500/2 = 250 이지만 250자리에 휴게소가 생기는 것이기 때문에 거리는 250-1 -> 249가 됨
			//여기가 어렵다.. -> 9-2=7 %3 = 2..1!!!! 방금 적으면서 깨달음 ㅋㄱㅋ <-- 근데 이것도 아니었음 ㅜㅜ
			if((RestDistance.get(RestDistance.size()-1)-(i-1))%i == 0) {
				if((RestDistance.get(RestDistance.size()-1)-(i-1))/i  > RestDistance.get(RestDistance.size()-2) && i < addRestNum) {
					i++;
					continue;
				}
			}else {
				if((RestDistance.get(RestDistance.size()-1)-(i-1))/i + 1  > RestDistance.get(RestDistance.size()-2) && i < addRestNum) {
					i++;
					continue;
				}
			}
				
				int temp = RestDistance.get(RestDistance.size()-1);
				RestDistance.remove(RestDistance.size()-1);
				int remainder = (temp-(i-1))%i;
				
				for(int u = 0; u<i; u++) {
					if(remainder != 0) {
						RestDistance.add(((temp-(i-1))/i)+1);
						remainder--;
					}else {
						RestDistance.add((temp-(i-1))/i);
					}
					
				}
				
				Collections.sort(RestDistance);
				j = j + i-1;
				i = 2;
			
		}
		System.out.println(Collections.max(RestDistance));
		
		int n = 10;
		System.out.println(n/4);
		System.out.println(n%4);
		//250, 501/2 = 249 ,250   1 2 3 4 5 6 7 8 9 
		//						      3		6	  
	}

}

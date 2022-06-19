package BackjoonProblem;

import java.io.*;
import java.util.StringTokenizer;

public class 날짜계산 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		String [] a = br.readLine().split(" ");
		int [] num = {Integer.parseInt(a[0]),Integer.parseInt(a[1]),Integer.parseInt(a[2])};
		int [] check = {1,1,1};
		int count = 1;
		
		while(!(check[0]==num[0] && check[1]==num[1] && check[2]==num[2])) {
			if((check[0]+1)%15==0) {
				check[0]=15;
			}else {
				check[0]=(check[0]+1)%15;
			}
			
			if((check[1]+1)%28==0) {
				check[1]=28;
			}else {
				check[1]=(check[1]+1)%28;
			}
			
			if((check[2]+1)%19==0) {
				check[2]=19;
			}else {
				check[2]=(check[2]+1)%19;
			}
			count++;
			
		}
		bw.write(count+"");
		bw.flush();

		

	}

}

package BackjoonProblem;

import java.io.*;
import java.util.StringTokenizer;

public class 수학적호기심 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T =Integer.parseInt(br.readLine());
		int [] count = new int [T];
		
		for(int i = 0; i<count.length; i++) {
			
			StringTokenizer st = new StringTokenizer(br.readLine()," ");
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			for(int a = 1; a<n-1; a++) {
				for(int b = a+1; b<n; b++) {
					String s = "";
					s=(a*a+b*b+m)/a*b+"";
					for(int j = 0; j<s.length(); j++) {
						char g = s.charAt(j);
						if(g == '.') {
							break;
						}
						count[i]++;
					}
				}
			}
		}
		
		
		bw.write(count[0]+"\n"+count[1]+"\n"+count[2]+"");
		bw.flush();
		
	}

}

package BackjoonProblem;

import java.io.*;
import java.util.StringTokenizer;

public class 수학은비대면강의입니다 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int nums [] = new int[6];
		int x,y;
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		int e = Integer.parseInt(st.nextToken());
		int f = Integer.parseInt(st.nextToken());
		y=(d*c-a*f)/(d*b-a*e);
		x=(c-b*y)/a;

		
		
		 bw.write(x+" "+y+"");
		 bw.flush();
		 
		
		
	}

}

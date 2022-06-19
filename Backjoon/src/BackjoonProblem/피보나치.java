package BackjoonProblem;

import java.util.Scanner;
import java.io.*;

public class 피보나치{
	static int zeroCount = 0;
	static int oneCount = 0;

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int b = Integer.parseInt(br.readLine());
		for(int i = 0; i<b; i++){
		int fiboNum = Integer.parseInt(br.readLine());
		
		int a = fibonacci(fiboNum);
        bw.write(zeroCount+" "+oneCount+"\n");
        zeroCount = 0;
        oneCount = 0;
        
        
        }
       bw.flush();
	}
        

public static Integer fibonacci(int fiboNum) {
	if(fiboNum == 0) {
		zeroCount++;
		return 0;
	} else if(fiboNum == 1) {
		oneCount++;
		return 1;
	}else {
		return fibonacci(fiboNum-1)+fibonacci(fiboNum-2);
	}
	
}

}

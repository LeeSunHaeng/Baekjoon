package BackjoonProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class primeNumber {

	public static void main(String[] args)  throws IOException{
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		   while(true) {
	        int a = Integer.parseInt(br.readLine());
	        
	        int [] array = new int[a+1];
	        int i = 2;
	        array[0]=0;
	        array[1]=1;
	        while(i<a+1){
	            array[i]=array[i-1]+array[i-2];
	            i++;
	        }
	        System.out.println(array[a]);
		   }
	}

}

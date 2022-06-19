package ProgrammersProblem;

import java.util.ArrayList;
import java.util.Arrays;

public class 큰수만들기 {
	
	static int highNum = 0;

	static StringBuffer str;
	public static void main(String[] args) {
		String number = "4177252841";
		
		int k = 4;
		
		
			
		

	}

	public String solution(String number, int k) {
        String answer = "";
        
        add(number,k,0,0,0,number.length());
        
        return answer;
    }
	
	
	static public void add(String number,int k, int idx, int count,int check,int length) {
		if(check == length) {
			return;
		}

		if(count == k) {

			if(highNum < Integer.parseInt(number)) {
				highNum = Integer.parseInt(number);
				
			}
			
			return;
		}
		else {
			
			
			System.out.println("str: "+str +" k: "+k+" idx: "+idx+" count: "+count+" check: "+check+" length: "+length);
			
			add(number,k,idx+1,count,check+1,length);
			str = str.deleteCharAt(idx);
			String n = str+"";
			add(n,k,idx,count+1,check+1,length);		
			

			

			
		}
	}
	
	
}

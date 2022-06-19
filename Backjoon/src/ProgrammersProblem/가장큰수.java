package ProgrammersProblem;

import java.util.Arrays;
import java.util.Collections;

public class 가장큰수 {

	public static void main(String[] args) {
		int [] nums = {3,30,34,5,9};
		String maxNum = "";
		
		String [] strNums = new String[nums.length];
		
		for(int i = 0 ; i<strNums.length; i++) {
			strNums[i] = nums[i]+"";
		}
		
		//Arrays.sort(strNums); 3 30 303  330 34 34330 5 534330           9 5 34 3 30
		Arrays.sort(strNums, (a, b) -> (b + a).compareTo(a + b));
		
		
		for(int i = 0; i<strNums.length; i++) {
			maxNum += strNums[i];
		}
		
		
		
		
		System.out.println(maxNum);

	}

}

package ProgrammersProblem;

import java.util.ArrayList;
import java.util.Arrays;


public class 로또의최고순위와최저순위 {

	public static void main(String[] args) {
		int [] lottos = {44, 1, 0, 0, 31, 25};
		int [] win_nums = {31, 10, 45, 1, 6, 19};
		
		int arr [] = solution(lottos,win_nums);
		System.out.println(Arrays.toString(arr));

	}

	
	  public static int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int count = 0;
	        int zeroCount = 0;
	        
	        ArrayList<Integer> lottosNum = new ArrayList<Integer>();
	        ArrayList<Integer> win = new ArrayList<Integer>();
	        
	        for(int i : lottos) {
	        	lottosNum.add(i);
	        }
	        for(int i : win_nums) {
	        	win.add(i);
	        }
	        
	        for(int i = 0; i<win.size(); i++) {
	        	if(win.contains(lottosNum.get(i))) {
	        		count++;
	        	}
	        	if(lottosNum.get(i) == 0) {
	        		zeroCount++;
	        	}
	        }
	        for(int i = 0; i<7; i++) {
	        	
	        	if(count == i) {
	        	answer[1] = 7-i;	
	        	
	        	if(count == 0) {
	        		answer[1] = 6;
	        	}
	        	}
	        	
	        	if(count+zeroCount == i) {
	        		answer[0] = 7-i;
	        		
	        		if(count+zeroCount == 0) {
		        		answer[0] = 6;
		        	}
	        	}
	        	
	        }
	        
	        
	        return answer;
	    
	}
	
}

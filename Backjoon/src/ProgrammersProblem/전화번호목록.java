package ProgrammersProblem;

import java.util.Arrays;

public class 전화번호목록 {

	public static void main(String[] args) {
		//String [] phone_book = {"123","123445","515123","455215","4878123","123123","12223156"};
		String [] phone_book = {"119", "97674223", "1195524421"};
		
		boolean a = solution(phone_book);
		
	}
	
    public static boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);

        	for(int i = 0 ; i<phone_book.length-1; i++) {
        		if(phone_book[i+1].length() >= phone_book[i].length() 
        				&& phone_book[i+1].substring(0, phone_book[i].length()).contains(phone_book[i])) {
        			answer=false;
        			break;
        		}
        	}
        
        return answer;
    }

}

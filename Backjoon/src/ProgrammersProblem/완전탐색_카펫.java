package ProgrammersProblem;

public class 완전탐색_카펫 {

	public static void main(String[] args) {
		int [] a = solution(24, 24);
		System.out.println(a[0]+" "+a[1]);
	}
	
	public static int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for(int i = 1; i<=yellow; i++) {
        	if(yellow%i==0) {
        		int x = yellow/i+2;
        		int y = i+2;
        		if(2*x+2*y-4==brown) {
        			answer[0]=x;
        			answer[1]=y;
        			break;
        		}
        	}
        }
        
        
        return answer;
    }

}

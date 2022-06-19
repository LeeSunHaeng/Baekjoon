package ProgrammersProblem;

public class 시저암호 {

	
	public static void main(String[] args) {
		String s="a B z";
		int n = 4;
		
	
		 String answer = "";
		    
		    char[] nextS = new char[s.length()];
		    
		    for(int i = 0; i<s.length(); i++) {
		    	nextS[i] = s.charAt(i);
		    }
		    for(int i = 0; i<nextS.length; i++) {
		    	nextS[i] = (char)(int)(nextS[i]+n);
		    }
		    for(int i = 0; i<nextS.length; i++) {
		    	answer += nextS[i];
		    }
		    System.out.println(answer);


}
public String solution(String s, int n) {
	
    String answer = "";
    
    char[] nextS = new char[s.length()];
    
    for(int i = 0; i<s.length(); i++) {
    	nextS[i] = s.charAt(i);
    }
    
    for(int i = 0; i<nextS.length; i++) {
    	if(nextS[i] != 0)
    	nextS[i] = (char)(int)(nextS[i]+n);
    }
    for(int i = 0; i<nextS.length; i++) {
    	answer += nextS[i];
    }
    return answer;
}
}
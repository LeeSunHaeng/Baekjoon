package BackjoonProblem;

import java.util.Scanner;

public class 반지 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		
		int count = 0;
		
		String str = scan.next();
		int num = scan.nextInt();	
				
		String [] arr = new String[num];
		for(int i = 0; i<arr.length; i++) {
			arr[i] = scan.next();
		}
		
		for(int i = 0; i<arr.length; i++) {
			for(int j = 0; j<10; j++) {
				String check = "";
				for(int k = 0; k<str.length(); k++) {
					check += arr[i].charAt((j+k)%10)+"";
				}
				if(str.equals(check)) {
					count++;
					break;
				}	
			}
		}	
		System.out.println(count);
	}
}

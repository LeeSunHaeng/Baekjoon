package BackjoonProblem;

import java.util.Scanner;

public class zero {

	public static void main(String[] args) {
		
		/*
		 * Scanner scan = new Scanner(System.in); int n = scan.nextInt(); int [] array =
		 * new int[n]; for(int i = 0; i<array.length; i++){ int num = scan.nextInt();
		 * if(num == 0){ array[i] =0; for(int j = i-1; j>-1; j--) { if(array[j] != 0) {
		 * array[j]=0; break; } } } else{ array[i] = num; } } int sum =0; for(int i = 0;
		 * i<array.length; i++){ sum += array[i]; } System.out.println(sum);
		 */
	        
		/*
		 * String star = "*"; for(int i = 0; i<10; i++) { System.out.println(star); star
		 * += "*"; }
		 */
		//10의 자릿수
		for(int i = 0; i<10; i++) {
			//1의 자릿수
			for(int j = 0; j<10; j++) {	
				//10의 자릿수 3,6,9 일때
				if(i==3 || i==6 || i==9) {
					//10의 자릿수가 3,6,9 이면서 1의 자릿수도 3,6,9 일때
					if(j==3 || j==6 || j==9) {
						System.out.print("짝");
					}
					else {
					System.out.print("짝"+" ");	
					}
				//10의 자릿수 3,6,9 아닐때	
				}else {
					//10의 자리수가 3,6,9가 아니면서 일의자리도 3,6,9가 아닐때
					if(j!=3 && j!=6 && j!=9) {
						System.out.print(i);
					}
				}
				
				//1의 자릿수가 3,6,9일때
				if(j==3 || j==6 || j==9) {
					System.out.print("짝"+" ");
				}
				//1의 자릿수가 3,6,9가 아닐때
				else {
					//1의 자릿수가 3,6,9가 아니면서 10의 자릿수도 3,6,9가 아닐때
					if(i!=3 && i!=6 && i!=9) {
						System.out.print(j+" ");
					}
				}
								
				
			}
			System.out.println("");
		}

	}

}

package BackjoonProblem;

import java.util.Scanner;

public class main {
	
	public static int[] que;
	public static int size = 0;
	public static int del = 0;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N  = scan.nextInt();
		que = new int[N];
		
		for(int i : que) {
			String str = scan.next();
			
			switch(str) {
			
			case "push" : int num1 = scan.nextInt();
						  push(num1);
						  break;
				
			case "pop" : sb.append(pop()).append('\n');
			 			 break;
				
			case "size" : sb.append(size()).append('\n');
						 break;
			case "empty" :sb.append(empty()).append('\n');
						 break;
			case "front" :sb.append(front()).append('\n');
			 		 	 break;
			case "back" :sb.append(back()).append('\n');
						 break;
				
			}
			
		}
		System.out.print(sb);
		

	}
	//push
	public static void push(int n) {
		que[size+del] = n;
		size++;
	}
	
	//pop
	public static Integer pop() {
		if(size == 0) {
			return -1;
		}
		else {
			int res = que[del];
			que[del] = 0;
			size--;
			del++;
			return res;
		}
		
	}
	
	//size
	public static Integer size() {
		return size;
	}
	
	//empty
	public static Integer empty() {
		if(size == 0) {
			return 1;
		}else {
			return 0;
		}
	}
	
	//front
	public static Integer front() {
		if(size == 0) {
			return -1;
		}
		else {
			return que[del];
		}
	}
	
	//back
	public  static Integer back() {
		if(size == 0) {
			return -1;
		}
		else {
			return que[size+del-1];
		}
	}
	
	
	
	
	
	
	
}

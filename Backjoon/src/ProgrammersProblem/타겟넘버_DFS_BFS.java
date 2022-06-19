package ProgrammersProblem;

public class 타겟넘버_DFS_BFS {
	static int answer;
	public static void main(String[] args) {
		int a [] = {4,1,2,1};
		int b = 4;
		answer = 0;
		search(a,b,0,0);
		System.out.println(answer);
	}
	
	public static void search(int [] a, int b, int index, int sum) {
		if(index==a.length) {
			if(sum==b) {
				answer++;
			}
		}else {
			sum+=a[index];
			search(a,b,index+1,sum);
			
			sum-=a[index];
			sum+=(-1*a[index]);
			search(a,b,index+1,sum);
		}
		
		
	}

}

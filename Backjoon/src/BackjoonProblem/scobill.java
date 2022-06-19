package BackjoonProblem;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class scobill {

	public static void main(String[] args) {
		
		int [] scoville = {1,2,3,5,6,8,9};
		int k = 8;
		int answer = 0;
		/*
		 * Arrays.sort(scoville);
		 * 
		 * for(int i = 0; i<scoville.length; i++) { if(scoville[i]<k && scoville[i]!=0)
		 * { scoville[i+1]=scoville[i]+scoville[i+1]*2; scoville[i]=0; count++; } }
		 * if(scoville[scoville.length - 1] < k) { count = -1;
		 * System.out.println(count); } else { System.out.println(count); }
		 */
		
		PriorityQueue<Integer> que = new PriorityQueue<Integer>();
		
		for(int n : scoville) {
			que.offer(n);
		}
		
		for(int i = 0; i<que.size(); i++ ) {
			
		if(que.size()>1 && que.peek()<k) {
			que.offer(que.poll() + que.poll()*2);
			answer++;
		}
		}
		
		if(que.peek() < k) {
			System.out.println(-1);
		}else {
			System.out.println(answer);
		}
		
		
		
	}

}

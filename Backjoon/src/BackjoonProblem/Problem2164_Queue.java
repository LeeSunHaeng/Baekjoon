package BackjoonProblem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164_Queue {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		//q에 데이터 입력!
		for(int i = 1; i<=n; i++) {
			q.offer(i);
		}
		//홀수 짝수 구분용 count
		int count = 0;
		//임시 저장공간
		int temp = 0;
		//규칙을 적용하기 위한 반복문!
		while(true) {
			
			if(q.size() == 1) {	//q에 데이터가 1개 남으면 반복문 탈출
				break;
			}
			
			if(count %2 == 0) {	//짝수번째의 동작
				q.remove();
			}else {				//홀수번째의 동작
				temp = q.poll();
				q.offer(temp);
			}
			count++;

		}
		
		System.out.print(q.peek());
		br.close();
	}

}

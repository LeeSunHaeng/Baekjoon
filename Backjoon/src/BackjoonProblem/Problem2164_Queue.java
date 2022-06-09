package BackjoonProblem;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2164_Queue {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		Queue<Integer> q = new LinkedList<Integer>();
		//q�� ������ �Է�!
		for(int i = 1; i<=n; i++) {
			q.offer(i);
		}
		//Ȧ�� ¦�� ���п� count
		int count = 0;
		//�ӽ� �������
		int temp = 0;
		//��Ģ�� �����ϱ� ���� �ݺ���!
		while(true) {
			
			if(q.size() == 1) {	//q�� �����Ͱ� 1�� ������ �ݺ��� Ż��
				break;
			}
			
			if(count %2 == 0) {	//¦����°�� ����
				q.remove();
			}else {				//Ȧ����°�� ����
				temp = q.poll();
				q.offer(temp);
			}
			count++;

		}
		
		System.out.print(q.peek());
		br.close();
	}

}

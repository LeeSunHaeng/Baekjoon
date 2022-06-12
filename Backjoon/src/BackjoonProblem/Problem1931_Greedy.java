package BackjoonProblem;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Problem1931_Greedy {
	//Greedy �˰��� -> Ž���_���� �ּ��� ��츦 �����ϴ� �����
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [][] time = new int[n][2];
		
		for(int i = 0 ;i<time.length; i++) {
			String [] temp = br.readLine().split(" ");
			time[i][0] = Integer.parseInt(temp[0]);
			time[i][1] = Integer.parseInt(temp[1]);
		}
		
		//ȸ�ǰ� ������ �ð� ������ �������� �����ϰ� ������ ��쿡�� ���۽ð��� ���� ������������ �����Ѵ�
		Arrays.sort(time, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1]!=o2[1] ? o1[1]-o2[1] : o1[0]-o2[0];
			}
		});
		//���� ���� ������ ���� ���� �����ϴ� ������ ������ ���ұ� ������,
		//ȸ�� ���� �ð����� ū ���� �ε����� �־��ָ鼭 ī��Ʈ �ϸ� �ȴ�
		int out = 0;
		int count = 0;
		for(int i = 0; i < time.length; i++) {
			if(time[i][0] >= out) {
				out = time[i][1];
				count++;
			}
			
		}
		System.out.println(count);

	}

}

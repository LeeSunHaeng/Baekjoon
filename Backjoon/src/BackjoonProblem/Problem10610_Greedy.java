package BackjoonProblem;

import java.io.*;

public class Problem10610_Greedy {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num = br.readLine();
		
		//�Է¹��� N�� �ڸ����� �ɰ��� �迭�� ����
		int [] numArr = new int[num.length()];
		
		//3�� ����� ������ �ڸ����� �� ���ϸ� 3�ǹ���̴�. <- �̰��� üũ�ϱ� ���� ������ �ڸ����� ���� ���ϱ� ���� ����
		int sum = 0;
		
		//0~9 ���� ��� ���ԵǾ��ִ��� üũ�ϱ� ���� �迭
		int [] numCount = new int [10];
		
		//N�ɰ��� �迭�� �ֱ� �� 0~9���� üũ, �ڸ����� �� ���ϱ�
		for(int i = 0; i<numArr.length; i++) {
			numArr[i] = num.charAt(i)-48;
			numCount[numArr[i]]++;
			sum += numArr[i];
		}
		
		StringBuilder sb = new StringBuilder();
		//30�� ����̱� ���� ����
		//1. 1�� �ڸ����� 0�̾����
		//2. �� �ڸ����� ���� 3�� ���������
		//3. 30���� Ŀ����
		if(num.contains("0") && sum%3 == 0 && Integer.parseInt(num) >= 30) {
			//0~9�� ���� ū 9���� sb�� �ٿ���
			for(int i = 9; i>=0; i--) {
				while(numCount[i]>0) {
					sb.append(i);
					numCount[i]--;
				}
			}
			System.out.println(sb.toString());
		}else {
			System.out.println("-1");
		}

	}

}

package BackjoonProblem;

import java.io.*;

public class Problem10610 {

	static int maxNum;
	static boolean[] check;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();
		String numArr[] = new String[num.length()];
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = num.charAt(i) + " ";
		}

		maxNum = -1;
		check = new boolean[numArr.length];
		search(numArr,"-1");
//		 String j = "3";
//		 String n = "";
//		 n = n+j;
//		 int y = Integer.parseInt(n);
//		 System.out.println(y);
		//��..�´µ�
//		int k = Integer.parseInt(""+"3");
//		System.out.println(k);
		System.out.println(maxNum);
	}

	public static void search(String[] numArr, String num) {
		if (num.equals("-1")) {
			num = "";
		}else {
		//ù��° ��ʹ� �Ǵµ� �ι�°�� �� �ȵ���??? ("" + "3")�� int�� ����ȯ �ϸ� 3�� �ƴѰ�??
		if (num.length() == numArr.length && !num.equals("-1")) {
			if (Integer.parseInt(num)%30 == 0) {
				if (maxNum < Integer.parseInt(num)) {
					maxNum = Integer.parseInt(num);
					return;
				}
			}

		}
		}
		
		
		for (int i = 0; i < numArr.length; i++) {
			if (!check[i]) {
				check[i] = true;
				System.out.println(num + numArr[i]);
				search(numArr, num+numArr[i]);
			}

		}
	}
}
package BackjoonProblem;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem9095 {
	
	static int arr [] = {1,2,3};
	static ArrayList<Integer> list = new ArrayList<>();
	static int count;
	
	public static void main(String[] args) {
		
		//�� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
		//3,4,7,10
		
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		int [] nums = new int[n];
		
		for(int i = 0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		
		for(int i = 0; i<nums.length; i++) {
			count = 0;
			search(nums[i],0);
			System.out.println(count);
		}
		
		sc.close();
	}
	
	public static void search(int num, int sum) {
		if(sum > num) {
			return;
		}
		else if (sum == num) {
			count++;
			return;
		}else {
			for(int i = 0; i<arr.length; i++) {
				search(num,sum+arr[i]);
			}
		}
	}

}

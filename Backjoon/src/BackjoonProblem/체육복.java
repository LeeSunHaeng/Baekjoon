package BackjoonProblem;

public class 체육복 {

	public static void main(String[] args) {
			int n = 5;
			int lost[] = {2,5};
			int reserve[] = {1,3,4};
					
			int answer = 0;
	        //학생 수 배열 student[] 만들어서 모두 1 입력
			int[] all = new int[n];

			for (int i : reserve)
				all[i - 1]++;

			for (int i : lost)
				all[i - 1]--;

			for (int i = 0; i < all.length; i++)
				if (all[i] < 0)
					if (i != all.length - 1 && all[i + 1] > 0) {
						all[i]++;
						all[i + 1]--;
					} else if (i != 0 && all[i - 1] > 0) {
						all[i]++;
						all[i - 1]--;
					}

			

			for (int i = 0; i < all.length; i++)
				if (!(all[i] < 0))
					answer++;

	        System.out.println(answer);

	}

}

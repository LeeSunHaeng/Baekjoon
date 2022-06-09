package BackjoonProblem;

import java.io.*;
import java.util.ArrayList;

public class Problem2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> card = new ArrayList<Integer>();
		

		for (int i = 1; i <= n; i++) {
			card.add(i);
		}
	
		int count = 0;
		int temp = 0;
		while (true) {
			if (count % 2 == 0) {
				card.remove(0);
			} else {
				temp = card.get(0);
				card.remove(0);
				card.add(temp);
			}
			count++;
			if (card.size() == 1) {
				break;
			}
		}
		System.out.println(card.get(0));
	}

}

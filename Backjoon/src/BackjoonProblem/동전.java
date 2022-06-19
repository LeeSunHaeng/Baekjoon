package BackjoonProblem;
/*
 문제
준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.

동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)

둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다. (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 */
import java.io.*;
public class 동전 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String [] array =br.readLine().split(" ");
		int N = Integer.parseInt(array[0]);
		int K = Integer.parseInt(array[1]);
		
		int [] coin = new int[N];

		for(int i=0; i<N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		int minNum =0;
		int count = 0;
		
		for(int i=0; i<coin.length; i++) {
			if(coin[i] > K) {
				minNum = i-1;
				break;
			}
		}
		
		/*
		 * for(int i = N-1; i>=0; i--) {
		 *  if(coin[i]<=K) {
		 *  count+=K/coin[i];
		 *   K=K%coin[i];
		 * } if(K==0) { break; } }
		 */

		
		  while(K>0) {		 
		  count += K/coin[minNum];
		  K=K%coin[minNum];
		  minNum--;
		  System.out.println(count+ " " + K+" " + minNum);
		  }
		 
		
		bw.write(count+"");
		bw.flush();
		
		


	}

}

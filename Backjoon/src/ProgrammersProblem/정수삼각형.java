package ProgrammersProblem;



public class 정수삼각형 {
	
	static int num = 0;
	static int [][] sample;

	public static void main(String[] args) {
		//[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]
		int triangle[][] = {    {7},
							   {3,8},
							  {8,1,0},
							 {2,7,4,4},
							{4,5,2,6,5}};
		
		int len = triangle[triangle.length-1].length;
		sample = new int[len][len];
		
		Solution sol = new Solution();
		int answer = sol.solution(triangle);
		System.out.println(answer);
		

	}
	
	
	public static class Solution {

    public int solution(int[][] triangle) {
        int answer = 0;
        search(triangle,0,0,0);
        answer = num;
        return answer;
    }									//가로				세로
    				//   트라이앵글 배열    현재 인덱스 번호	   	몇번 더했는지	 현재 더해진 값
    public void search(int[][]triangle,   int idx,       int count,    int sum) {
    	
        sum += triangle[count][idx];
    	sample[count][idx] = sum;
    	
    	if(count == triangle.length-1) {
    		if(num<sum) {
    			num = sum;
    		}
    		return;
    	}
    	
    	if(sample[count+1][idx] < sum+triangle[count+1][idx]) {
    		search(triangle,idx,count+1,sum);
    	}

    	search(triangle,idx+1,count+1,sum);

		/*
		 * if(triangle[count+1][idx] > triangle[count+1][idx+1]) {
		 * search(triangle,idx,count+1,sum);
		 * 
		 * }else if(triangle[count+1][idx] < triangle[count+1][idx+1]) {
		 * search(triangle,idx+1,count+1,sum); }
		 * 
		 * else { search(triangle,idx,count+1,sum); search(triangle,idx+1,count+1,sum);
		 * }
		 */

    	

    }
    
}

}



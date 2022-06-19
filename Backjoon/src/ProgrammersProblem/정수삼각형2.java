package ProgrammersProblem;

public class 정수삼각형2 {
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
        best(triangle,triangle.length-2,0);
        //search(triangle,0,0,0);
        answer = num;
        return answer;
    }
					//   트라이앵글 배열    현재 인덱스 번호	   	몇번 더했는지
    				//                     3			0			
    public void best(int[][]triangle,   int idx,       int count) {

    	if(count == 0) {
    		for(int i = 0; i<triangle[triangle.length-1].length; i++) {
    			sample[triangle.length-1][i] = triangle[triangle.length-1][i];
    		}
    	}
    	
    	if(count == triangle.length-1) {
    		num=sample[0][0];
    		return;
    	}
    	
    	for(int i = 0; i<triangle[idx].length; i++) {
    		sample[idx][i] =
    		sample[idx+1][i]>=sample[idx+1][i+1]?(triangle[idx][i]+sample[idx+1][i]):(triangle[idx][i]+sample[idx+1][i+1]);
    	}
    	
    	
    	
    	best(triangle,idx-1,count+1);
    	
    }
    
}

}

package BackjoonProblem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class blackJack {

	public static void main(String[] args) {
		
		 Scanner scan =  new Scanner(System.in);
	        
		 List<Integer> aa = new ArrayList<Integer>();
		 
	        int N = scan.nextInt();											//5 21
	        																//5 6 7 8 9
	        int M = scan.nextInt();      
	        
	        int result =0;
	        
	        int [] blackJack = new int[N];
	        	      
	        //숫자들 받기
	        for(int i =0; i<N; i++){
	            blackJack[i] = scan.nextInt();
	        }
	        //숫자 3개를 뽑아서 더하고 M과의 차이를 리스트에 저장
	        for(int i = 0; i<N-2; i++){
	        	
	            for(int j = i+1; j<N-1; j++){
	            	
	                for(int k =j+1; k<N; k++){
	                    aa.add(M-(blackJack[i]+blackJack[j]+blackJack[k]));
	                }
	            }
	        }
	        
	        //정렬
	        Collections.sort(aa);
	        
	        //0보다 같거다 큰 수가 나오면 result에 인덱스 값 저장하고 반복문 빠져나옴
	        for(int i = 0; i<aa.size(); i++){
	            if(aa.get(i) >= 0){
	            	result=i;
	                break;
	            }
	        }
	      
	        
	          System.out.println(M-aa.get(result));
	        

	}

}

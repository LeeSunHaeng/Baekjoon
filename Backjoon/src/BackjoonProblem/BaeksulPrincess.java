package BackjoonProblem;
import java.io.*;
public class BaeksulPrincess {
    static int [] arr = new int[9];
    static boolean [] use = new boolean[9];
	public static void main(String[] args)throws IOException {
		
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        
        int result = 0;
        int sum = 0;
        
        
        for(int i = 0; i<9; i++){
        result = Integer.parseInt(br.readLine());
        sum += result;
        arr[i] =result;
        }
        int wish = sum-100;
        fun(0,0,wish,0);

   
        
    }
    public static void fun(int index, int sum, int want, int count){
    	if(count == 2) {
        if(sum == want){
        for(int i = 0; i<9; i++){
        if(use[i] == false){
        System.out.println(arr[i]);
        }
        }
         return;  
        }
    	}else{
            if(index+1 !=10){
        use[index] = true;
        fun(index+1,sum+arr[index],want,count+1);
        use[index] = false;
        fun(index+1,sum,want,count);
            }
        
        }
    }
    
    
	

}

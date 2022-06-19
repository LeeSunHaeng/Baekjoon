package BackjoonProblem;

import java.io.*;
public class 숫자의개수{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long [] nums = new long[3];
        for(int i = 0; i<3; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        long sum = 1;
        for(int i = 0; i<3; i++){
            sum *= nums[i];
        }
        String len = sum+"";
        int [] count = new int[10];

       
        for(int i = 0; i<len.length(); i++){

            count[len.charAt(i)-'0']++;
        }
        for(int i = 0; i<count.length; i++){
            bw.write(count[i]+""+"\n");
            bw.flush();
        }  
        
      
    }
}
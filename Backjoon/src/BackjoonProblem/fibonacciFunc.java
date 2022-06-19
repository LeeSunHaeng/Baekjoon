package BackjoonProblem;

import java.util.Scanner;

public class fibonacciFunc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        
        int a = scan.nextInt();
        
        int [] array = new int[a+1];
        
        int i = 2;
        array[0]=0;
        array[1]=1;
        
        while(i<a+1){
            array[i]=array[i-1]+array[i-2];
            i++;
        }
        
        System.out.println(array[a]);
	}

}

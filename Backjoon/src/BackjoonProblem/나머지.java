package BackjoonProblem;
import java.io.*;
import java.util.ArrayList;
public class 나머지 {

	public static void main(String[] args) throws IOException {
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		  BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		  ArrayList<Integer> list = new ArrayList<Integer>();
		  ArrayList<Integer> ckList = new ArrayList<Integer>();
		  for(int i = 0; i<10; i++) {
			  list.add(Integer.parseInt(br.readLine())%42);
		  }
		  
		  for(int i = 0; i<list.size(); i++) {
			  if(ckList.contains(list.get(i))) {
				  continue;
			  }
			  ckList.add(list.get(i));
		  }
		  
		 bw.write(ckList.size()+"");
		 bw.flush();
	}

}

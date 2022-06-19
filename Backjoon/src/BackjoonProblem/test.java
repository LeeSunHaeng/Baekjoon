package BackjoonProblem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class test {
   public static void main(String[] args) {
      try {         
         File file = new File("C:\\python.txt");
         FileReader fileReader = new FileReader(file);
         BufferedReader bufReader = new BufferedReader(fileReader);
         LinkedList<Map<String, Object>> list = new LinkedList<>();
         String line = "";
         
         while((line = bufReader.readLine()) != null) {
            int upperCaseCnt = 0;
            for(int i=0; i<line.length(); i++) {
               if(line.charAt(i) >= 'A' && line.charAt(i) <= 'Z') upperCaseCnt++;
            }
            list.add(getInfo(line, line.length(), upperCaseCnt, line.replaceAll("[a-zA-Z0-9]", "").length()));
         }
         
         Collections.sort(list, new Comparator<Map<String, Object>>() {
            @Override
            public int compare(Map<String, Object> o1, Map<String, Object> o2) {
               String content1 = (String) o1.get("content");
               String content2 = (String) o2.get("content");
               return content1.compareTo(content2);
            }
         });
         
         for(Map<String, Object> m : list) {
               System.out.printf("%d,%d,%d %s\n",m.get("len"), m.get("upperLen"), m.get("spLen"), m.get("content"));
         }
         
         bufReader.close();
      } catch(FileNotFoundException e) {
         System.out.println(e);
      } catch(IOException e) {
         System.out.println(e);
      }
   }
   
   static Map<String, Object> getInfo(String contents, int contentsLen, int upperCaseCnt, int specialCharCnt){
      Map<String, Object> map = new HashMap<>();
      map.put("content", contents);
      map.put("len", contentsLen);
      map.put("upperLen", upperCaseCnt);
      map.put("spLen", specialCharCnt);
      return map;
   }
}

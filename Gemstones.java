import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner sc = new Scanner(System.in);
      char alphabet[] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int array[] = new int[26];
      boolean flag[]= new boolean[26];
      for(int i=0;i<26;i++)
      {
        array[i]=0;
        flag[i]=false;
      }
      
      int gems = sc.nextInt();
      String gemArray[]=new String[gems];
      
      for(int i=0;i<gems;i++)
      {
        gemArray[i]=sc.next();
        
      }
      int counter=0;
      for(String s:gemArray)
      {
        counter++;
        int len = s.length();
        for(int j=0;j<len;j++)
        {
          char c=s.charAt(j);
          int index = Arrays.binarySearch(alphabet,c);
          int num = array[index];
          boolean f = flag[index];
          if(f==false)
          {
            num++;
            array[index]=num;
            flag[index]=true;
          }
        }
        
        for(int i=0;i<26;i++)
      {
        flag[i]=false;
      }
      }
      int count=0;
      for(int n:array)
      {
        
        if(n==gems)
          count++;
      }
      System.out.println(count);
    }
}
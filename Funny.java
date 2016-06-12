import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Funny {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner sc = new Scanner(System.in);
      
      int testCases = sc.nextInt();
      String sArray[] = new String[testCases];
      
      for(int i=0;i<testCases;i++)
      {
        sArray[i]=sc.next();
      }
      
      for(String s:sArray)
      {
        StringBuffer b = new StringBuffer(s);
        String r ="";
        
        for(int i=s.length()-1;i>=0;i--)
        {
          r=r+ s.charAt(i);
          //System.out.println(r);
        }
        //System.out.println(r);
        int j=0;
        for(j=0;j< s.length()-1;j++)
        {
          int nums = Math.abs(((int) (s.charAt(j) - s.charAt(j+1))));
          int numr = Math.abs(((int) (r.charAt(j) - r.charAt(j+1))));
          
          //System.out.println(nums+"   "+numr);
          if(nums == numr)
            continue;
          else
          {
            System.out.println("not funny");
            break;
          }
        }
        if(j==s.length()-1)
          System.out.println("funny");
      }
    }
}
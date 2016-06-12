import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String strArray[] = new String[testCases];
        int intArray[] = new int[testCases];
        for(int i=0;i<testCases;i++)
        {
          strArray[i]=sc.next();
          intArray[i]=sc.nextInt();
        }
        
        for(int i=0;i<testCases;i++)
        {
          String str = strArray[i];
          int k = intArray[i];
          
          int strLen = str.length();
          int size = (strLen*(strLen+1))/2;
          int l=0;
          String subArray[] = new String[size];
          
          for(int m=0;m<strLen;m++)
          {
            for(int j=m;j<strLen;j++)
            {
              subArray[l] = str.substring(m,j+1);
              l++;
            }
          }
          Arrays.sort(subArray);
          String mainStr="0";
          for(String s:subArray)
          {
            //System.out.println(s);
            mainStr = mainStr.concat(s);
          }
          //System.out.println(mainStr);
          System.out.println(mainStr.charAt(k));
          
        }
       
     
        
        /*System.out.println(testCases);
        System.out.println(str);
        System.out.println(k);*/
    }
}
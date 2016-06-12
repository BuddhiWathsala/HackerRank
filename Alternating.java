import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Alternating {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      char alphabet[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
      int array[] = new int[26];
      
      for(int i=0;i<26;i++)
        array[i]=0;
      
      
      Scanner sc = new Scanner(System.in);
      String str = sc.nextLine();
      str = str.toLowerCase();
      
      for(int i=0;i<str.length();i++)
      {
        char c = str.charAt(i);
        //System.out.print(c);
        int flag = Arrays.binarySearch(alphabet,c);
        //System.out.println();
        //System.out.println(flag);
        if(flag>=0)
        {
          if(array[flag] ==0)
            array[flag]= 1;
        }
      }
      for(int num:array)
      {
        //System.out.print(num);
        if(num==0)
        {
          System.out.println("not pangram");
          return;
        }
      }
      System.out.println("pangram");
    }
}
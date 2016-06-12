import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) 
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      
      Scanner in = new Scanner (System.in);
      int final_count=0;
      int array_size = in.nextInt();
      if(array_size > 100)
          {
          System.out.println("Error");
          return;
      }
      int[] number_array = new int[array_size];
      boolean return_val;
      for(int i=0; i < array_size; i++)
      {
        int number = in.nextInt();
        if(number >10000 || number < -10000)
            {
            System.out.println("Error");
            return;
        }else{
        number_array[i] = number;
        }
      }
      
      for(int i=0;i < array_size;i++)
      {
        for(int j=i; j < array_size; j++)
        {
          int[] sub_array = Arrays.copyOfRange(number_array,i,j+1);
          
          GetSum g = new GetSum();
          g.Print(sub_array);
          return_val = g.getArraySum(sub_array);
          
          if(return_val)
            final_count ++;
          else
            continue;
        }
      }
      System.out.println(final_count);
       
    }
    
    
}

class GetSum
{
  public boolean getArraySum(int[] array)
    {
      int total= 0;
      for(int num:array)
      {
        total += num;
      }
      
      if(total<0)
        return true;
      else
        return false;
    }
  public void Print(int[] arr)
  {
    for(int num:arr)
    {
      System.out.println(num);
    }
    System.out.println("..........");
  }
}
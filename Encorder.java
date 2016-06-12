import java.io.*;
import java.util.*;

class Encorder
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    String head = sc.next();
    String data = sc.next();
    
    int hl=head.length();
    int dl=data.length();
    String returnData = data;
    int intArray[]=new int[hl];
    int p=0;
    intArray[0]=0;
    for(int k=1;k<hl;k++)
    {
      while(p>0 && head.charAt(k)!= head.charAt(p))
      {
        p=intArray[p-1];
      }
      if(head.charAt(k)== head.charAt(p))
        p++;
      intArray[k]=p;
      //System.out.println("p: "+p);
    }
    int i=0;
    int count=0;
    for(int j=0;j<dl;j++)
    {
      while(i>0 && data.charAt(j) != head.charAt(i))
      {
        i=intArray[i-1];
      }
      if(data.charAt(j)== head.charAt(i))
        i++;
      
      if(i==hl)
      {
        String tempData = data;
        int start=j-hl+count;
        int end = start+hl;
        //System.out.println(end);
        returnData = returnData.substring(0,end)+"0"+returnData.substring(end);
        //returnData=tempData;
        //System.out.println(returnData);
        i=intArray[i-1];
        count ++;
        continue;
      }
    }
    System.out.println(returnData);
  }
}
import java.io.*;
import java.util.*;
class DNA 
{
  public void checkDNA()
  {
    Scanner sc = new Scanner(System.in);
    int knownS = sc.nextInt();
    String strArray[] = new String[knownS];
    int countAr[] = new int[knownS];
    int tot=0;
    for(int i=0;i<knownS;i++)
    {  
      strArray[i] = sc.next();
    }
    String unknown = sc.next();
    for(int i=0;i<knownS;i++)
    {  
      countAr[i] = this.match(strArray[i],unknown);
      tot +=countAr[i];
    }
    for(int num:countAr){
      double d = (double) num;
      double answer = (d/tot)*100;
      System.out.println(answer);
    }
  }
  
  public int match(String known,String unknown)
  {
    int d=10;
    char array[] = {'a','b','c','d'};
    int intArray[] = {1,2,3,4};
    int q=13;
    double p=0,t=0;
    int count=0;
    
    int ul = unknown.length();
    int kn = known.length();
    double h = Math.pow(10,(kn-1));
    for(int i=0;i<known.length();i++)
    {
      int indexp = Arrays.binarySearch(array,known.charAt(i));
      int indext = Arrays.binarySearch(array,unknown.charAt(i));
      //System.out.println("aa :"+indexp);
      p = p*(10)+(intArray[indexp]);
      t = t*(10)+(intArray[indext]);
      
      
    }
    for(int j=0;j<=ul - kn;j++)
    {
      if(p%q == t%q)
      {
        String sub =unknown.substring(j,j+known.length());
        //System.out.println(sub);
        if(sub.equals(known))
        {
          count++;
        }
      }
      if(j<unknown.length() - known.length())
      {
        char num1 = unknown.charAt(j);
        char num2 = unknown.charAt(j+kn);
        int index1 = Arrays.binarySearch(array,num1);
        int index2 = Arrays.binarySearch(array,num2);
        //System.out.println(index1+"  "+index2);
        //System.out.println(num2);
        int no1 = intArray[index1];
        int no2 = intArray[index2];
        t = (t- (no1)*h)*10 + (no2);
        //System.out.println(t);
      }
    }
    return count;
  }
}
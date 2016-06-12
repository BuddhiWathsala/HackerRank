import java.util.*;

class StringMatcher
{
  public static int KMP(String text, String pattern)
  {
    //create pattern array
    //which find sub strings
    int i=0;
    int indexArray[] = new int[pattern.length()];
    indexArray[0]= 0;
    for(int j=1;j<pattern.length();j++)
    {
      while(i>0 && pattern.charAt(i)!= pattern.charAt(j))
      {
        i = indexArray[i-1];
      }
      if(pattern.charAt(i)== pattern.charAt(j))
        i++;
      indexArray[j]=i;
    }
    
    //matching part
    int n = text.length();
    i=0;
    for(int j=0;j<n;j++)
    {
      while(i>0 && pattern.charAt(i)!= text.charAt(j))
      {
        i = indexArray[i-1];
      }
      if(pattern.charAt(i)== text.charAt(j))
        i++;
      if(i==pattern.length())
      {
        //System.out.println("shift: "+(j-pattern.length()+1));
        return (j-pattern.length()+1);
      }
      //System.out.println(i+"..."+j);
    }
    
    for(int num:indexArray)
      System.out.println(num);
    return -1;
  }//end KMP
  
  public static int BooyerMoore(String text , String pattern)
  {
    char alphabet[] = {'a','b','c','d','e','f','r'}; 
    int array[] = new int[alphabet.length];
    int pl = pattern.length();
    int tl =text.length();
    for(int i=0;i< alphabet.length;i++)
    {
      array[i]= pl;
    }
    //int num1 = Arrays.binarySearch(alphabet,'l');
    //System.out.println(num1);
    for(int i=0;i<pl-1;i++)
    {
      char patternChar = pattern.charAt(i);
      int index = Arrays.binarySearch(alphabet,patternChar);
      //System.out.println(index);
      if(index >=0)
        array[index]= pl -1 -i;
      
    }
    
    int i = pl-1;
    int j = pl -1;
    
    while(i< tl-1)
    {
      j = pl -1;
      
      while(j>=0)
      {
        char tc = text.charAt(i);
        char pc = pattern.charAt(j);
      
        if(tc == pc)
        {
          i--;
          j--;
        }else
        {
          if(j == pl -1)
          {
            int index = Arrays.binarySearch(alphabet,tc);
            int shift = array[index];
            i += shift;
            break;
          }else
          {
            int index = Arrays.binarySearch(alphabet,text.charAt(i+1));
            int shift = array[index];
            i += shift;
            break;
          }
        }
      }
      if(j == -1)
      {
        System.out.println("ok"+(i+1));
        break;
      }
    }
    
    /*for(int num:array)
      System.out.println(num);*/
    return -1;
  }//end booyer moore
}//end class
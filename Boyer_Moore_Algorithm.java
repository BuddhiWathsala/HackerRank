import java.util.*;

class Boyer_Moore_Algorithm{
  
  public static int BMA(String text,String pattern)
  {
    ArrayList<Holder> alphabet = new ArrayList<Holder>();
    char[] alp = {'a','b','c','d','e'};
    
    int text_len = text.length();
    int pattern_len = pattern.length();
    int index_arr[]= {pattern_len,pattern_len,pattern_len,pattern_len,pattern_len};
    
    for(int i=0;i<pattern_len;i++)
    {
      char tempc = pattern.charAt(i);
      //System.out.println("a:"+tempc);
      int index = Arrays.binarySearch(alp,tempc);
      int new_num = pattern_len-i-1;
      
      index_arr[index]= new_num;
    }
    
    for(int i=0;i<text_len-pattern_len-1;i++)
    {
      char t_c = text.charAt(i+pattern_len-1);
      
      
      for(int j=pattern_len-1;j>=0;j--)
      {
        char p_c = pattern.charAt(j);
        System.out.println(t_c+" "+p_c);
        if(t_c != p_c)
        {
          int alp_index = Arrays.binarySearch(alp,t_c);
          i= i+index_arr[alp_index];
          
        }
        if(j==0)
          return i+1;
      }
     
    }
    
    for(int i=0;i<5;i++)
    {
      
      //System.out.println(index_arr[i]);
    }
    return 0;
  }
  
}

class Holder
{
  int num=0;
  char ch ;
  
  Holder(char c,int n)
  {
    num=n;
    ch = c;
  }
  
  int get_num()
  {
    return num;
  }
}
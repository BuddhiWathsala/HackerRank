import java.util.*;
class Solution1{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
      Stack main_stack = new Stack(10);
      Stack temp_stack = new Stack(10);
      
      main_stack.push("(");
      main_stack.push("[");
      main_stack.push("}");
      main_stack.push(")");
      Matcher M = new Matcher();
      boolean flag = false;
      int j=0;
      
      
        //String S = sc.next();
        
        /*for(int i=0;S.charAt(i) != '\n';i++){
          char sub = S.charAt(i);
          String sub_s = Character.toString(sub);
          main_stack.push(sub_s);
        }*/
      //System.out.println(input);
      int size = main_stack.get_size();
      
     for(int i=0;i<size-1;i++)
     {
       System.out.println("+++");
       String str = main_stack.get(i);
       temp_stack.push(str);
     }
     for(int i=0;i<size;i++)
     {
       String s1 = main_stack.pop();
       String s2 = temp_stack.pop();
       System.out.println(s1+"+"+s2);
       flag = M.isMatch(s1,s2);
       
       if(flag)
       {
         continue;
       }
       else{
         System.out.println(true);
         break;
       }
     }
     if(flag) 
      System.out.println(false);
      
   }
}

//Stack

class Stack
{
  int stack_size,tos;
  
  String stack_array[] = null; 
  
  Stack(int size)
  {
    stack_size = size;
    stack_array = new String[stack_size];
    tos = 0;
  }
  
  public void push(String ch)
  {
    if(tos == stack_size - 1){
      System.out.println("sorry!! stack is full");
      return;
    }else{
    stack_array[tos] = ch;
    tos ++;}
  }
  
  public String pop()
  {
    if(tos == 0){
      System.out.println("sorry !! Stack is empty");
      return " ";
    }else{
      String return_char = stack_array[tos-1];
      tos--;
      return (return_char);
    }
  }
  
  public String get(int i)
  {
    return stack_array[i];
  }
  
  public boolean isEmpty()
  {
    if(tos == 0)
      return true;
    else
      return false;
  }
  
 public int get_size()
 {
   int size=0;
   if(tos==0){
     return 0;
     
   }else{
     
     return tos+1;
   }
 }
}
class Matcher
{
 
  
  public boolean isMatch(String s1,String s2)
  {
    if(s1.equals("(") && s2.equals(")"))
      return true;
    else if(s1.equals("{") && s2.equals("}"))
      return true;
     else if(s1.equals("[") && s2.equals("]"))
      return true;
     else
       return false;
  }
}
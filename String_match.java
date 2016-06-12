import java.util.*;

class String_match{
 
  
  public static void main(String[] args){
     //Scanner S=new Scanner(System.in);
     //String SS=S.next();
     //System.out.println(SS);
    String String1="aaabbbcccd";
    String String2="ccc";
    String_match_class S=new String_match_class(String1,String2);
    int result = S.match();
    System.out.println(result);
  }
  
}
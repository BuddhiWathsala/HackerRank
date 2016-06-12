import java.util.*;

class String_match_with_RCA{
 
  
  public static void main(String[] args){
     //Scanner S=new Scanner(System.in);
     //String SS=S.next();
     //System.out.println(SS);
    String String1="322647595068";
    String String2="322";
    Rabin_Carp_Algorithm S=new Rabin_Carp_Algorithm(String1,String2);
    S.check();
    //System.out.println(String1.substring(3,6)==String2.substring(0,3));
  }
  
}
import java.io.*;
import java.util.*;

class Virus
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    
    String virus = sc.next();
    String program = sc.next();
    String correct = "0";
    
    int vl = virus.length();
    int pl = program.length();
    
    for(int j=0;j<vl-1;j++)
      correct = correct.concat("0");
    
    for(int i=0;i<=pl-vl;i++)
    {
      if(((program.substring(i,i+vl)).equals(virus)) && i!=0)
      {
        program = program.substring(0,i) +correct+program.substring(i+vl);
        System.out.println(program);
          
      }
    }
  }
}    

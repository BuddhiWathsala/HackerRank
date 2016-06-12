class Rabin_Carp_Algorithm{
  
  static void check(String T,String P){
    String text;
    String pattern;
  
  
    text=T;
    pattern=P;
  
    int text_len=text.length();
    int pattern_len=pattern.length();
    int q=13,d=26;
    double h=(Math.pow(d,pattern_len-1));
    int p=0;
    double t0=0,t=0;
    int i,s;
    for(i=0;i<=pattern_len-1;i++){
      p=(d*p+(int)((pattern.charAt(i))-('0')));
      t0=(d*t0+(int)((text.charAt(i))-('0')));
      
      
    }
    t=t0;
    for(s=0;s<=text_len-pattern_len;s++){
      if (((int)p)%q==((int)t)%q){
        if(p==t){
          System.out.println("Pattern shift "+s);
          break;
        }
      }
      if(s<text_len-pattern_len){
        t=(d*(t-((int)((text.charAt(s))-('0')))*h)+((int)((text.charAt(s+pattern_len))-('0'))));
        System.out.println(t);
        double x=((int)((text.charAt(s))-('0')))*h;
        double y=((int)((text.charAt(s+pattern_len))-('0')));
        
      }
    }
  }
}


class Count_Birth
{
  public Year Y1,Y2;
  
  
  Count_Birth(int y1,int y2)
  {
    Y1= new Year(y1);
    Y2=new Year(y2);
  }
  
  public int count(int m1,int d1,int m2,int d2)
  {
    int day1,day2;
    
    day1=Y1.days(m1,d1);
    day2=Y2.days(m2,d2);
    
    return (day2-day1);
  }
  
  public void count_b(int m1,int d1,int m2,int d2)
  {
    int years,month,days;
    
    if(m1==m2)
    {
      if(d1==d2)
      {
        month=0;
       days=0;
       years=Y2.show()-Y1.show();
      }else if(d1<d2)
      {
        month=0;
        days=d2-d1;
        years=Y2.show()-Y1.show();
      }else
      {
        month=11;
        days=d2-d1+Y2.days(m1);
        years=Y2.show()-Y1.show()-1;
      }
      
    }else if(m1<m2)
    {
      if(d1==d2)
      {
        month=m2-m1;
        days=0;
        years=Y2.show()-Y1.show();
      }else if(d1 < d2)
      {
        month=m2-m1;
        days=d2 - d1;
        years=Y2.show()-Y1.show();
      
      }else
      {
        month=m2-m1-1;
        days=Y2.days(m1)-d1+d2;
        years=Y2.show()-Y1.show();
      }
    }else
    {
      if(d1==d2)
      {
        month=12+m2-m1;
        days=0;
        years=Y2.show()-Y1.show()-1;
      }else if(d1<d2)
      {
        month=12-m1+m2;
        days=d2-d1;
        years=Y2.show()-Y1.show()-1;
      
      }else
      {
        month=12-m1+m2-1;
        days=Y2.days(m2-1)-d1+d2;
        years=Y2.show()-Y1.show()-1;
      
      }
      
    }
    System.out.println("Years : "+years);
    System.out.println("Months: "+month);
    System.out.println("Days  : "+days);
  }
  
  
}
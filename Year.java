class Year
{
  int year;
  
  Year(int y)
  {
    year=y;
  }
  
  public int show(){
    return (this.year);
  }
  
  public boolean isLeapYear()
  {
    boolean flag=false;
    if(year%4==0 && year%100 != 0)
    {
      flag= true;
    }else if(year%4==0 && year%100 == 0)
    {
      if(year%400==0){
        flag= true;
      }else
      {
        flag= false;
      }
    }
    return flag;
  }
  
  public int days()
  {
    int day=0;
    if(this.isLeapYear()){
      day=366;
    }else{
      day=365;
    }
    return day;
  }
  
  public int days(int month)
  {
   
    
    switch(month)
    {
      case(1):
      case(3):
      case(5):
      case(7):
      case(8):
      case(10):
      case(12):
        return 31;
      case (4):
      case(6):
      case(9):
      case(11):
        return 30;
      case(2):
        if(this.isLeapYear())
        return 29;
        else
          return 28;
      default:
        System.out.println("error input");
        return 0;
     }
  }
  
  public int days(int month,int day)
  {
    int D=0,i;
    
    for(i=1;i<month;i++)
    {
      D += this.days(i);
    }
    D += day;
    return (D);
  }
}
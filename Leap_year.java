class Leap_year
{ public static void main(String[] args)
  { int year=2020;
    if(((year%4==0)&&(year%100!=0))||(year%400==0))
     System.out.println("Year "+year+" is a leap year");
    else
     System.out.println("Year "+year+" is not leap year");
  }
}
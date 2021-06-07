

class Time
{
  private  int hours,minute,second;
   public Time()
{
  this(0,0,0);
 }
   public Time(int h)
{
  this(h,0,0);
 }
   public Time(int h,int m)
{
  this(h,m,0);
 }

public Time(int h,int m,int s)
{
  setTime (h,m,s);
  }
public void setTime (int h, int m, int s)
{
   sethour(h);
   setminute(m);  
  setsecond(s);
 }
}

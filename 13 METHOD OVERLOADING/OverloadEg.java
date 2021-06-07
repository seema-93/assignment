
class Overload
{
  void getdata(int a,int b)
  {
    int x=a,y=b;
    int z=x+y;
    System.out.println("Addition=" +z);
 }

 void getdata(int a, float b)
 {
   float x=a,y=b;
   float z=x*y;
   System.out.println("Multiplication=" +z);
 }
}


class OverloadEg
{
  public static void main(String args[]) 
  {
    Overload o=new Overload();
    o.getdata(23,85);
    o.getdata(100,23.89f);
 }
}
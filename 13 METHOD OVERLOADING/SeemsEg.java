
class Seems
{
  void getdata(int a,int b)
  {
    int x=a,y=b;
    int z=x+y;
    System.out.println("Addition=" +z);
 }

 void getdata(int a, int b,int c)
 {
   float x=a,y=b,z=c;
   float s=x*y*z;
   System.out.println("Multiplication=" +s);
 }
}


class SeemsEg
{
  public static void main(String args[]) 
  {
    Seems o=new Seems();
    o.getdata(23,85);
    o.getdata(100,23,58);
 }
}
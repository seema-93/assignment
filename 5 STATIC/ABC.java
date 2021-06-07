

class ABC
{
 static int a=85;
 void fun()
{
  int b=95;
  System.out.println(a+ " " +b);
  ++a ;
}
 public static void main(String args[])
 {
   ABC obj=new ABC();
   obj.fun();
}
}
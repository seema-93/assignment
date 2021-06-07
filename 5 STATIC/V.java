/*STATIC VARIABLE INSTANCE VARIABLE*/

class V
{
  static int t=30;
  int c=65;
 public static void main(String args[])
 { 
   int a=10;
   V ref=new V(); 
   System.out.println(a);
   System.out.println(V.t);
    System.out.println(ref.c); 
 }
}
    
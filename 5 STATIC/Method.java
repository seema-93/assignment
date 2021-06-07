/*CALL STATIC METHOD IN INSTANCE METHOD*/


class Method
{
 public static void main(String args[])
 {
  Test obj=new Test();
   obj.display();
 }
}
class Test
{ 
  static int add()
 {
  int a=90,b=100;
  int c=a+b;
  return c;
 }

 void display()
 {
 int x=add();
 System.out.println("Addition =" +x);
 }
}


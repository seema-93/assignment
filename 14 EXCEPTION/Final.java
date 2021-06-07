/*FINALLY BLOCK*/

class Final
{
 public static void main(String args[])
  {
  int a[]=new int[3];
  try
  {
   System.out.println("Access element three:" +a[3]);
   }

   catch(ArrayIndexOutOfBoundsException e)
   {
      System.out.println("Exception thrown:" +e);
   }

  finally
{
   a[0]=6;
   System.out.println("First element value:" +a[10]);
  System.out.println("The finally statement is executed");
}
}
}
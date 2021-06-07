/*ARITHMATIC EXCEPTION USING TRY CATCH*/

class ExcpArith
{
   public static void main(String args[])
  {
    System.out.println("main method started");
    int a=60,b=0,c;
      try
     {
       c=a/b;
      System.out.println(c);
     }
     catch(ArithmeticException e)
     {
         System.out.println("can not devide by zero");
     }
   System.out.println("main method ended");
}
}

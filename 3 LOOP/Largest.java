/*WAP TO PRINT LARGEST NUMBER AMONG THREE NUMBERS*/

import java.util.Scanner;
class Largest
{
  public static void main(String args[])
  {
     int a,b,c;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the 3 nos");
    a=obj.nextInt();
    b=obj.nextInt();
    c=obj.nextInt();
     if(a>b&&a>c) 
    {
    System.out.println("a is greater");
  }
   else if(b>a&&b>c)
{
 System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}
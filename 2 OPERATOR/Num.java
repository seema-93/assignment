/*WAP FOR TWO NUMBERS ARE EQUAL OR NOT*/

import java.util.Scanner;
class Num
{
  public static void main(String args[])
  {
    int x,y;
   System.out.println("Enter the values of x and y:");
   Scanner obj=new Scanner(System.in);
    x=obj.nextInt();
    y=obj.nextInt();
   if(x==y)
  {
   System.out.println("x and y are equal");
   }
  else
 {
  System.out.println("x and y are not equal");
 }
}
}
   
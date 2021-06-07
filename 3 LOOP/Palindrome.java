/* WAP TO PALINDROME OR NOT*/

import java.util.Scanner;
class Palindrome
{
   public static void main(String args[])
   {
    int n,rev=0,z;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter the number");
    n=obj.nextInt();
    z=n;
    while(n>0)
    {
     rev=(rev*10)+n%10;
     n=n/10;
   }
   if(rev==z)
   {
    System.out.println("Palindrome");
   }
   else
  {
    System.out.println("Not Palindrome");
}
}
}
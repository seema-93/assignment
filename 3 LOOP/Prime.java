/* WAP TO READ A NO AND CHECK THE NO IS PRIME OR NOT*/

import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {
     int n;
     int temp=0;
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter the no");
     n=obj.nextInt();
     for(int i=2;i<=n-1;i++)
     {
         if(n%i==0) 
        {    
         temp=temp+1;
        }
      }
      if(temp==0)
      {
      System.out.println("number is prime");
     }
     else
     {
        System.out.println("number is not prime");
     }
   }
}
    
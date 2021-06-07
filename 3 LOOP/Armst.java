/* WAP TO READ A NO AND CHECK THE NO IS ARMSTRONG OR NOT*/
  
import java.util.Scanner;
 class Armst
   {
     public static void main(String args[])
     {
       int n,mod,cube,sum=0;
       int t;
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the no");
       n=obj.nextInt();
       t=obj.nextInt();
       t=n;
       while(n>0)
       {
         mod=n%10;
         cube=mod*mod*mod;
         sum=sum+cube;
         n=n/10;
       }
       if(sum==t)
      {
       System.out.println("No is armstrong");
       }
       else
        {
        System.out.println("No is not armstrong");
        }
    }
} 

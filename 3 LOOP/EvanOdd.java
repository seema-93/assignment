/*WAP TO READ NO AND CHECK NO IS EVEN OR ODD*/
 
import java.util.Scanner;
class EvanOdd
{
 public static void main(String args[])
  {
   int n;
   Scanner obj=new Scanner(System.in);
   System.out.println("Enter the no");
   n=obj.nextInt();
   if(n%2==0)
   {
     System.out.println("NO IS EVEN");
   }
  else
   {
    System.out.println("NO IS ODD");
   }
 }
}
          
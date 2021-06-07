/* WAP TO CHECK A NUMBER IS EVEN OR ODD USING SWITCH*/

import java.util.Scanner;
class Switcheg
{
  public static void main(String args[])
   {
     int num;
    Scanner obj=new Scanner(System.in);
     System.out.println("Enter any integer");
    num=obj.nextInt();

   Switch(num%2);
  {
     case 1 :
     System.out.println(num+ "is even number");
     break;
     
    default:
     System.out.println(num+ "is odd number");
    }
}
}


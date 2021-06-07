/* WAP TO ENTER 2 NOS AND ONE OPRATORS(+,-,*,/) TO PERFORM BASIC ARITHMATIC OPERATIONS USING SWITCH*/

import java.util.Scanner;
class Arithmatic
{
   public static void main(String args[])
   {         
     int a,b;
     char op;
     double result;
     Scanner obj=new Scanner(System.in);
     System.out.println("Enter two nos and operator");
     a=obj.nextInt();
     b=obj.nextInt();
     op=obj.next().charAt(0);
     switch(op)
     {
       case  '+' :
       	     result =a+b;
  	    System.out.println("result"  +result);
                    break;
    
      case  '-' :
                   result =a-b;
                  System.out.println("result"  +result);
                  break;
    
     case  '*' :
                 result= a*b;
                System.out.println("result"  +result);
                break;
    
    case  '/' :
               result =a/b;
              System.out.println("result"  +result);
              break;

     default:
    System.out.println("Invalid opration");
}
}
}
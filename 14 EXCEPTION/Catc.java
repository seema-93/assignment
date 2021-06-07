/*MUPTIPLE CATCH BLOCK*/

class Catc
{
  public static void main(String args[])
  {
     try
    {
       int a=10, b=3,c;
       c=a/b;
        System.out.println(c);
       
       int arr[]={30,90,60};
       System.out.println(arr[0]);

      String str="Seema";
       System.out.println(str.toUpperCase());
     }

    catch(ArrayIndexOutOfBoundsException a)
    {
      System.out.println("Array Exception");
    }
    
     catch(ArithmeticException e)
     {
     System.out.println("Arithmetic Exception");
      }
     
      catch(NumberFormatException n)
      {
     System.out.println("Number Exception");
      }

      catch(Exception x)
       {
        System.out.println("All type Exception");
       }
    }
}

        
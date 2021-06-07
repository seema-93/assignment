/*PROGRAM FOR ARRAYINDEXOUTOFBOUNDARY */

class ArrayBound
{
   public static void main(String args[])
  {
    int arr[ ]= {20,30,40,80};
      try
     {
       arr[5]= 50;
       System.out.println("value="  +arr[5]);
     }

    catch(ArrayIndexOutOfBoundsException e)
   {
     System.out.println("Array index overflow exception");
   }
 }
}
/*ADDITION OF INTEGER VALUE*/

class ArrAdd
{
 public static void main(String args[])
 {
   int arr[]= {1,9,78,55,6,3};
   int sum=0;
   System.out.println("Sum of array elements are:");
  for(int i=0; i<arr.length;i++) 
  {
     
     sum=sum+arr[i];
   }
    System.out.println(sum);
}
}
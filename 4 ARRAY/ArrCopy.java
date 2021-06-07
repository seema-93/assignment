/*COPY AN ARRAY INTO AN ANOTHER ARRAY*/


class ArrCopy
{
 public static void main(String args[])
 {
   int arr1[]= {10,32,56,89,55};
   int arr2[]=new int[arr1.length];
   
  for(int i=0; i<arr1.length;i++) 
  {
    arr2[i]=arr1[i];
  }
   for(int i=0; i<arr2.length;i++) 
  {
    System.out.println(arr2[i]);
  }
}}
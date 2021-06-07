/*FIND THE MINIMUM VALUE OF ARRAY*/


class ArrMin
{
 public static void main(String args[])
 {
   int a[]= {8,9,5,6,4,7};
  int min=a[0];
  for (int i=1;i<a.length;i++)
   {
    if (min>a[i])  
    {
      min=a[i];
    }
}
 System.out.println("Minimum valus:" +min);
}
 }
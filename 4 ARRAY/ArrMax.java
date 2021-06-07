/*FIND THE MAXIMUM VALUE OF ARRAY*/


class ArrMax
{
 public static void main(String args[])
 {
   int a[]= {8,9,5,6,4,7};
  int max=a[0];
  for (int i=1;i<a.length;i++)
   {
    if (max<a[i])  
    {
      max=a[i];
    }
}
 System.out.println("Maximum valus:" +max);
}
 }
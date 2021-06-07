/*DUPLICARE ELEMENT IN ARRAY*/


class ArrDupli
{
 public static void main(String args[])
 {
   int a[]= {8,9,5,6,4,7,9,2};
  for(int i=0;i<a.length;i++)
  {
    for(int j=i+1;j<a.length;j++)
   {
    if(a[i]==a[j])
     {
      System.out.println("The duplicate Elements="  +a[i]);
     }
   }
  }
}
}
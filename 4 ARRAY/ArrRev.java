/*REVERSE OF ARRAY ELEMENT*/


class ArrRev
{
 public static void main(String args[])
 {
   int a[]= {8,9,5,6,4,7,11,2};
    for(int i=0;i<a.length;i++) 
   {
    System.out.println(a[i]);
   }

    for(int i=a.length-1;i>0;i--)
   {
   
   System.out.println(a[i] +  "");
   }
}
}
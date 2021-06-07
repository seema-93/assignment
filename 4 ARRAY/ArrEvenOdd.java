class ArrEvenOdd
{
 public static void main(String args[])
 {
   int a[]= {18,9,5,6,4,7,11,2};

   for(int i=0;i<a.length;i++)
  {
     if(a[i]%2==0)  
    {
     System.out.println("Even no="+a[i]);
    }
 }
    for(int i=0;i<a.length;i++)
   {
     if(a[i]%2!=0)  
    {
     System.out.println("Odd no="+a[i]);
    }
 }
}
}

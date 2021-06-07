/* AVERAGE OF AN ARRAY INTEGER*/

class Arravg
{
  public static void main(String args[])
  {
   double a[]= {10.20,30,40,50,60};
   int i,avg;
   int sum=0;
   for(i=0; i<a.length;i++)
  {
    sum +=a[i];
  }
 avg=sum/a.length;
 System.out.println("The average =" +avg);
}
}

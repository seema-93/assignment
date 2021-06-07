class ArrComm
{
 public static void main(String args[])
 {
   int a[]= {18,9,5,6,4,7,11,2};
   int b[]={1,3,8,10,5,13,19};
   for(int i=0;i<a.length;i++)
   {
    for(int j=0;j<b.length;j++)
     {
       if (a[i]==b[j])
       {
         System.out.println("The common element=" +a[i]); 
       }
    }
  }
}
}  

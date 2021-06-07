class Arrayadd
{
public static void main(String args[])
 {
   int p[][]={{5,6},{5,4}};
   int t[][]={{3,7},{9,5}};
   int add[][]=new int[2][2];
   int i,j;
   System.out.println("Matrix a:");
   for(i=0;i<2;i++)
    {  
     for(j=0;j<2;j++)
     {  
       System.out.println(p[i][j]+ "\t");
      }
	System.out.println();
   }
System.out.println("Matrix b:");
for(i=0;i<2;i++)
    {  
     for(j=0;j<2;j++)
     {  
       System.out.println(t[i][j]+ "\t");
      }
}	System.out.println();
System.out.println("Matrix a:");
for(i=0;i<2;i++)
    {  
     for(j=0;j<2;j++)
     {  
	add[i][j]=p[i][j]-t[i][j];
 }
}
System.out.println("ADDTION OF MATRICES");
for(i=0;i<2;i++)
    {  
     for(j=0;j<2;j++)
     {  
       System.out.println(add[i][j]+ "\t");
      }
	System.out.println();
     }
 }
}
/* STRING SPILT */


class Spil
{
 public static void main(String args[])*963
   String str="Hello-Java-program";
    String parts[ ]= str.split("-");
   
    for(int i=0;i<parts.length; i++)
    {
    System.out.println("-------------------->" +parts[i]);
    }
  }
}
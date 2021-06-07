/*PROGRAM FOR FIENOTFOUNDEXCEPTION */

class ExcpFile
{
  public static void main(String args[])
{ 
   try 
   {
   File file=new file("e://file.txt");
    
      fileHeader fr=new fileHeader(file);
   }

    catch(FileNotFoundException e)
    {
      System.out.println("File does not exist");
    }
}
}
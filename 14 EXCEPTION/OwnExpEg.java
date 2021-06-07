/*CREATING OWN EXCEPTION*/

class MyException extends Exception
{
  public String toString()
  {
    return"Invalid marks";
  }
}

class OwnExpEg
{
   public static void main(String args[])
  {
      int marks=110;
        try
        {
           if(marks>100)
               throw new MyException();
               System.out.println("marks:"  +marks);
         }

         catch(MyException e)
        {
            System.out.println(e);
         }
    }
}
/*INDEX OF AN ARRAY ELEMENT*/

class ArrInd
{
  public static void main(String args[])
 {
  String [] month={" jan","feb","march","april","may","june" };
  int index=0;
 for( int i=0;i<month.length;i++)
 {
    if (month [i]=="may")
  {
    index=i; 
  }
}
  System.out.println("Index=" +index);
}
}
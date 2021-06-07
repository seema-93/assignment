/* CLASS,OBJECT,METHOD AND SIGNATURE*/ 

import java.util.Scanner;
class Branch
{
  int bran_id;
  String bran_name;
  void display()
   {
    System.out.println("Branch Id=" +bran_id);
    System.out.println("Branch Name=" +bran_name);
   }
    public static void main(String args[])
   {
      Branch b1=new Branch();
      b1.bran_id=1;
      b1.bran_name="COMPUTER ENGINEER";
      Branch b2=new Branch();
      b2.bran_id=2;
      b2.bran_name="ELECTRONICS ENGINEER";
      b1.display();
      b2.display();
    }
}
  
  
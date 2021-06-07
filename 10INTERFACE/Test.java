interface I1
 {
   void show();
}

interface I2
 {
    void display();
}

class Test implements I1,I2
 {
    public void show()
   {
      System.out.println("Hello");
   } 
public void display()
 {
  System.out.println("Java");
}

public static void main(String args[])
  {
    Test t=new Test();
     t.show();
     t.display();
  }
}    
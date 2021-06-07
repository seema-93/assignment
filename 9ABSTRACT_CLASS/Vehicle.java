/*ABSTRACT CLASS AND METHOD*/


abstract class Vehicle
  {
    abstract void start();
  }

class car extends Vehicle
  {
      void start()
     {
       System.out.println("Car have 4 wheels");
     }
  }

class scooter extends Vehicle
{
     void start()
     {
         System.out.println("Scooter having 2 wheels");
     }
 public static void main(String args[])
  {
     car c=new car();
     c.start();

     scooter s=new scooter();
     s.start();
  }
}

  

class Student
{
   int id;
String name;
String city;
 
Student(int id, String name)
{
  this.id=id;
  this.name=name;
}

Student (int id, String name, String city)
 {
    this.id=id;
  this.name=name;
  this.city=city;
}

void display()
{
System.out.println("id: " +id+      "   name :"     +name+     "    city:"     +city);
}
}
class Studenteg
{
  public static void main(String args[])
  {
   Student s=new Student(1, "Kavya");
   s.display();
   Student s1=new Student(2, "Divya","Aurangabad");
   s1.display();
}
}

   
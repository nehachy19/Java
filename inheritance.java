class animal
{
    String name="DOggy";
    void eat()
    {
        System.out.println("EAting");
    }
}
 class Dog extends animal
 {
     void bark()
     {
         System.out.println("Barking ");
         //System.out.println(name);
     }
     void names()
     {
         System.out.println(name);
     }
 }

 class cat extends Dog{
     void meow()
     {
         System.out.println("Meowing");
     }
 }
  public class inheritance
  {
      public static void main(String args[])
      {
          cat c=new cat();
          Dog d=new Dog();
          c.eat();
          d.eat();
          d.bark();
          c.bark();
          d.names();

      }
  }
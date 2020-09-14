class student
{
    String name;
    int Roll;
   static String College="CPS";

   student(String n, int r)
   {
       name=n;
       Roll=r;


   }
   void display()
   {
       System.out.println(name+"  " +Roll+ " " +College);
   }
}
  public  class statics
  {
      public static void main(String args[])
      {
          student s1=new student("Neha", 1);
          student s2=new student("Tarun", 2);
          s2.College="RPS";
          s1.display();
          s2.display();
          
      }
  }

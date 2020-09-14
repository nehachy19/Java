class student
{
    int Roll;
    String name;
    static String college="CPS";

    student(int r, String n)
    {
        Roll=r;
        name=n;
    }
    static void change()
    {
        college="BBT";
    }
    void display()
    {
        System.out.println(Roll+"  "+name+"  " +college);
    }
}
   public class staticmethod
   {
       public static void main(String args[])
       {
           student.change();
           student s1=new student(1, "Neha");
           student s2=new student(2, "Tarun");
           s1.display();
           s2.display();
       }
   }

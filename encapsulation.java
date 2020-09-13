class student
{
    String name;
    public String getname()
    {
        return name;
    }

    public void setname(String name)
    {
        this.name= name;
    }
}
 public class encapsulation
 {
     public static void main(String args[])
     {
         student s=new student();
         s.setname("Neha");
         System.out.println(s.getname());
     }
 }
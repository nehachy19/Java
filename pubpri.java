 class a
{
    public int a;
    public void seta(int a)
    {
        this.a=a;
        System.out.println(a);
         
    }
}

 class b
{
    private int b;
    public void setb(int b)
    {
        this.b=b;
        
         System.out.println(b);
    }
}
public class pubpri
{
    public static void main(String args[])
    {
         a first=new a();
         first.seta(20);
         first.a=30;
         b second=new b();
         second.setb(20);
         //BElow Line will give the error because its private
         //second.b=30

         
    }
   


}
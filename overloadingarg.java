class addition
{
    static int add2(int a, int b)
    {
        return a+b;

    }
    static int add3(int a, int b, int c)
    {
        return a+b+c;
    }
}
 public class overloadingarg

 {
     public static void main(String args[])
     {
     System.out.println(addition.add2(5,5));
     System.out.println(addition.add3(5,5,5));
     }
 }
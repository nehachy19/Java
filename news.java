class print
{
   static int a;
   print()
       {
         a++;
       }
   
}
   public  class news
   {
       public static void main(String args[])
{print p1=new print();
        print p2=new print();
         print p3=new print();
          print p4=new print();
          System.out.println(print.a);
}
   }

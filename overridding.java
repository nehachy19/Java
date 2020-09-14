class Bank
{
    int intrest()
    {
        return 0;
    }
}
 class SBI extends Bank
 {
     int intrest()
         {
             return 5;
         }

 }
 class ICICI extends Bank
 {
     int intrest()
     {
         return 7;
     }

 }
  class overridding
  {
      public static void main(String args[])
      {
          SBI s=new SBI();
          ICICI i=new ICICI();
          System.out.println(s.intrest());
          System.out.println(i.intrest());
      }
  }
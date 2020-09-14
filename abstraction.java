abstract class Bike
{
     Bike()
    {
        System.out.println("Bike is Created");
    }
    abstract void run();
    public void gear()
    {
        System.out.println("Grear Activated");
    }
}
class Honda extends Bike
{
void run()
{
    System.out.println("Bike is Started");
}
} 
public class abstraction
{
    public static void main(String args[])
    {
        Bike b1=new Honda();
        b1.run();
        b1.gear();
    
    }
}
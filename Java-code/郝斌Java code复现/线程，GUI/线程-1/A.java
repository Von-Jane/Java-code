public class A extends Thread
{
      public void run()
    {
        while(true)
        {
            System.out.println("AAAA\n");
        }
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.start();
        while(true)
        {
            System.out.println("BBBB\n");
        }
    }
}
public class B
{
    public void run()
    {
        while(true)
        {
            System.out.println("AAAA\n");
        }
    }
}
class N
{
    public static void main(String[] args)
    {
        A aa = new A();
        Thread t = new Thread(aa);
        t.start();
        while(true)
        {
            System.out.println("BBBB\n");
        }
    }
}

import java.io.StringReader;

public class A extends Thread
{
    public static int tickets = 100;
    public static String str = new String("哈哈");
    public void run()
    {
        while(true)
        {
            synchronized("不")
            {
                if(tickets>0)
                {
                    System.out.printf("%s线程正在出售%d张票\n",Thread.currentThread().getName(),tickets);
                    --tickets;
                }
            }
            try {
                Thread.sleep(1);
            }
            catch (Exception e)
            {
            }
        }
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa1 = new A();
        aa1.start();
        A aa2 = new A();
        aa2.start();
    }
}

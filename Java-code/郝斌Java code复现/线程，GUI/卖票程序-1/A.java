class A implements Runnable
{
    public static int tickets = 100;
    public void run()
    {
        while(true)
        {
            synchronized ("a")//只要是String类就行。
            {
                if (tickets > 0)
                {
                    System.out.printf("%s线程正在出售%d张票\n",Thread.currentThread().getName(),tickets);
                    --tickets;
                }
                else
                {
                    break;
                }
                try
                {
                    Thread.sleep(1);
                }
                catch(Exception e)
                {
                }

            }
        }
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        Thread tt1 = new Thread(aa);
        Thread tt2 = new Thread(aa);
        tt1.start();
        tt2.start();
    }
}
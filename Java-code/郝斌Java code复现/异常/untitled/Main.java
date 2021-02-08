import java.util.stream.StreamSupport;

class A extends Thread
{
    public void run()
    {
        while(true)
        {
            System.out.println("haha");
            try {
                Thread.sleep(500);
            }
            catch(Exception e)
            {

            }
        }

    }
}
public class Main {
    public static void main(String[] A)
    {
        A aa =new A();
        aa.start();
        while(true)
        {
            System.out.println("BBBBB");
            try {
                Thread.sleep(1000);
            }
            catch(Exception e)
            {

            }


        }
    }
}

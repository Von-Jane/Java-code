import java.io.IOException;
public class B
{
    public void f() throws IOException//本方法不处理，让调用者main来处理。
    {
        throw new IOException();// 抛出异常，自己不处理。
    }
}
class F
{
    public static void main(String[] args) //throws IOException
    {
        B bb = new B();
        try
        {
           bb.f();
        }
        catch(IOException e)
        {
        }
    }
}

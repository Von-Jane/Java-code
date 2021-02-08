import java.io.*;
public class A
{
    public void f()
    {
        try
        {
            throw new IOException();
        }
        catch(IOException e)
        {
        }
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        aa.f();
    }
}

public class A
{
    int divide(int a,int b)
    {
        return a/b;
    }
    public void f()
    {
        g();
    }
    public void g()
    {
        divide(6,0);

    }
}
class M
{
    public static void main(String[] args)
    {
        try
        {
            new A().f();
        }
        catch(Exception e)
        {
            e.printStackTrace();//打印堆栈里的路径信息。即将错误路径显示出来。
        }
    }
}

interface It
{
    void f();
}
class A implements It
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
    public void g()
    {
    }
}
class M
{
    public static void main(String[] args)
    {
        It it;//局部变量
        it = new A();
        it.f();
        //it.g();it可调用从接口继承或重写的接口，不可调用子类特有方法。
    }
}
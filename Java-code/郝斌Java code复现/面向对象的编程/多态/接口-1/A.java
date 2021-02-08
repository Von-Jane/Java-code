interface It
{
    public static final int i = 10;
    public abstract void f();
}
interface It2
{
    int i = 30;
    void f();

}
class A implements It2
{
    int i = 10;
    public void f()
    {
        System.out.printf("%d\n", i);
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
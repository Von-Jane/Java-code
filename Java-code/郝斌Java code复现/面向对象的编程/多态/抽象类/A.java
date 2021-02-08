abstract class A
{
      abstract public void f();
}
class B extends A
{
    public void f()
    {
       System.out.printf("BBBB\n");
    }
}
class M
{
    public static void main(String[] args)
    {
       // A aa = new A();A为abstract类型，无法实例化
        B bb = new B();
        bb.f();
        A aa;
        aa = bb;
        aa.f();//多态
    }
}

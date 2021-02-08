class A
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
}
class B extends A
{
    public void f()
    {
        System.out.printf("BBBB\n");
    }
    public void g()
    {
        System.out.printf("GGGG\n");
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        aa = bb;
        bb =(B)aa;
        aa.f();
        bb.f();
        //aa.g();error
    }
}
//结果：BBBB
     //BBBB
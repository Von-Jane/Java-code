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
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        B bb = new B();
        aa.f();
        bb.f();
        aa = bb;
        //bb = aa
        aa.f();
    }
}
//结果：AAAA
     //BBBB
     //BBBB
class A
{
    public int  i = 10;
    private static A aa = new A();
    private A()
    {

    }
    public static A getA()
    {
        return aa;
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa1=A.getA();
        A aa2= A.getA();
        aa2.i = 30;
        System.out.printf("%d\n",aa1.i);
    }
}


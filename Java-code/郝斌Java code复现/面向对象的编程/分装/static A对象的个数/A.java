class A
{
    private int i;
    private static int cnt = 0;
    public A()
    {
        ++cnt;
    }
    public A(int i)
    {
        this.i = i;
        ++cnt;
    }
    public static int getCnt()
    {
        return cnt;
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa1 = new A();
        A aa2 = new A(2);
        System.out.printf("A对象的个数： %d\n",A.getCnt());
    }
}
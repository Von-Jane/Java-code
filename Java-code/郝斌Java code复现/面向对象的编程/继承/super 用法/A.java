class A
{
    public int i;
    public A (int i)
    {
        this.i = i;
    }
}
class B extends A
{
    public int j;
    public B(int i,int j)
    {
        super(i);
        this.j = j;
    }
}
class M
{
    public static void main(String[] args)
    {
        B bb = new B(11,33);
        System.out.printf("%d,%d\n",bb.i,bb.j);
    }
}

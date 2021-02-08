public class A
{
    int divide(int a,int b)
    {
        int m;
        System.out.println("AAAA\n");
        m = a/b;
        return m;
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        //aa.divide(6,0);
        try
        {
            aa.divide(6,3);
        }
        catch(ArithmeticException e)
        {
            //e.printStcakTrace();
            System.out.printf("除零错误，除数不能为零");
        }
        System.out.printf("%d\n",aa.divide(6,3));
    }
}
//结果 AAAA AAAA 2

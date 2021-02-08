class DivisorIsZeroException extends Exception
{
    public DivisorIsZeroException(String errormessage)
    {
        super(errormessage);
    }
}
class A
{
    int divide(int a,int b) throws DivisorIsZeroException
    {
        int m = 1;
        if(b==0)
            throw new DivisorIsZeroException("111");
        else
            m= a/b;
        return m;
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        try
        {
            aa.divide(6, 3);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
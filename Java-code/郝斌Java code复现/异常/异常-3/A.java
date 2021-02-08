class A
{
    public static void main(String[] args)
    {
        int m= 99;
        try
        {
            m=3;
            System.out.printf("%d\n",m);
        }
        catch(Exception e)
        {
        }
        System.out.printf("%d\n",m);//外部的m对应5行m,若未赋值，则会报错。
    }
}
//结果 3 3
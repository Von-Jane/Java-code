import java.io.IOException;

class A
{
    //public void f()
    {
        //throw new IOException();//属于exception异常，程序员必须捕获处理，否则编译报错。
    }
    public void g()
    {
        throw new ArithmeticException();//属于RuntimeException异常，可处理，也可不处理，编译不会报错，运行会报错。
    }
}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
    }
}

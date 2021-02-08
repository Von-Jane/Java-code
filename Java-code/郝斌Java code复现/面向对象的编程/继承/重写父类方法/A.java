public class A
{
    public void f()
    {
        System.out.printf("AAAA\n");
    }
    public void f(int i)//函数的重载
    {
        System.out.printf("哈哈\n");
    }
}
class B extends A
{
   public void f()
   {
       super.f(10);
       System.out.printf("BBBB\n");
   }
}
class M
{
    public static void main(String[] args)
    {
        B bb = new B();
        bb.f();

    }
}
//结果：哈哈
     //BBBB
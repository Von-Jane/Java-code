public class A
{
   int divide(int a,int b)
   {
       int m = 0;
       try
       {
           m = a/b;
           System.out.printf("%d\n",m);
       }
      catch(ArithmeticException  e)
      {
          System.out.printf("除数不能为零\n");
      }
       System.out.printf("1111\n");
       return m;//error java认为try内部都有可能报错，所以无论b的值是零或不是零，
       // 在try外部的 int m;未赋值，自然，外部的return m;就未初始化。
   }
}
class M
{
    public static void main(String[] args)
    {
        new A().divide(8, 0);
        System.out.printf("2222\n");
    }
}
//结果 除数不能为零 1111 2222

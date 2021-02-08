class A
{
   public  static int i;
   private static int j;
   protected static int k;
   public void  g()
   {

   }
   private void s()
   {

   }
   protected void b()
   {

   }
}
class B extends A
{
     private void f()
    {
        i = 10;
        k = 30;
        g();
        b();
    }
}
class M
{
    public static void main(String[] args)
    {
        A.i= 99;
        B.i=100;
        System.out.printf("%d\n",A.i);
    }
}
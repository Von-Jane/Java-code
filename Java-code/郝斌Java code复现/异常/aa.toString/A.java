public class A
{
}
class M
{
    public static void main(String[] args)
    {
        System.out.println(new A());
        A aa = new A();
        System.out.println(aa);
        System.out.println(aa.toString());
    }
}
//结果  A@7ef20235
//     A@27d6c5e0
//     A@27d6c5e0

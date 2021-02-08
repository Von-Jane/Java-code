public class A
{

}
class M
{
    public static void main(String[] args)
    {
        A aa = new A();
        System.out.println(aa.toString());
        System.out.println(aa);
    }
}
//A@7ef20235
//A@7ef20235
//说明A类中有Tostring方法，且Tostring方法输出的是new A()的地址。

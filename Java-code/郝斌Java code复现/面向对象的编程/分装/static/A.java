//static属性i属于类本身，可以直接通过类名的方式访问访问i
public class A
{
    public static int i  = 10;
}
class M
{
    public static void main(String[] args)
    {
        System.out.printf("%d\n",A.i);
    }
}

import java.util.*;
public class A
{
    public String toString()
    {
        return "哈哈";
    }
}
class M
{
    public static void main(String[] args)
    {
        ArrayList al = new ArrayList();
        al.add(12345);
        al.add("张三");
        al.add(66.66);
        al.add(new A());
        System.out.println(al);

    }
}
//[12345, 张三, 66.66, 哈哈]
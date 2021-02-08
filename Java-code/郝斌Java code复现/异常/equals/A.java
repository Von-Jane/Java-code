public class A
{
    public int i;
    public A(int i)
    {
        this.i = i;
    }
    public boolean equals(Object obj)
    {
        A aa = (A)obj;//强制类型转换  double x=6.6,  i=(int)x,  i=6
        if(this.i==aa.i)// 当前对象的i和obj代表的i相等
            return true;
        else
            return false;
    }

}
class M
{
    public static void main(String[] args)
    {
        A aa1 = new A(2);
        A aa2 = new A(2);
        System.out.println(aa1.equals(aa1));

        //if(aa1==aa2)
            //System.out.println("aa1与aa2相等\n");
        //else
            //System.out.println("aa1与aa2不相等\n");

    }
}
//结果 true

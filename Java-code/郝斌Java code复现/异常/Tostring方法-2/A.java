public class A
{
    public int x,y;
    public A(int x,int y)
    {
        this.x = x;
        this.y = y;
    }
    public String toString()
    {
        return "["+x+","+y+"]";
    }
}
class K
{
    public static void main(String[] args)
    {
        A dd= new A(3,5);
        System.out.printf("%s\n",dd);
        System.out.printf("%s\n",dd.toString());
    }
}
//[3,5]
//[3,5]

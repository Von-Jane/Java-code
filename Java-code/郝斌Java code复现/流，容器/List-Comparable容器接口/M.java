import java.util.*;
class Student implements Comparable
{
    private int id;
    private String name;
    public Student(int id ,String name)
    {
        this.id = id;
        this.name = name;
    }
    public String toString()
    {
        return id + "" + name;
    }
    public int compareTo(Object o)
    {
        Student st = (Student)o;
        if(this.id == st.id)
           return 0;
        else if (this.id > st.id)
            return 1;
        else
            return -1;
    }
}
public class M
{
    public static void main(String[] args)
    {
        List L = new ArrayList();
        L.add(new Student(1000,"张三"));
        L.add(new Student(1005,"李四"));
        L.add(new Student(1003,"王五"));
        Collections.sort(L);
        System.out.println(L);
    }
}
//[1000张三, 1003王五, 1005李四]
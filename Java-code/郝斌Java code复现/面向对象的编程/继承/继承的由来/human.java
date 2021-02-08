class human
{
    public String name = "张三";
    public int age = 22;
}
class student extends human
{
    public double score = 66.6;
}
class M
{
    public static void main(String[] args)
    {
        student st = new student();
        System.out.printf("%s, %f",st.name,st.score);
    }

}

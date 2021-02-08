class A
{
    public static int i = 10;
    public static void show ()
    {
        System.out.printf("%d\n",i);
    }
}
class M {
    public static void main(String[] args) {
        A aa1 = new A();
        A aa2 = new A();
        A aa3 = new A();
        aa1.i = 20;
        aa2.show();
        System.out.printf("%d\n ", aa3.i);

    }
}
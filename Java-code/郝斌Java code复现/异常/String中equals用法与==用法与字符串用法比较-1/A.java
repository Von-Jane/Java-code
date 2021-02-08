public class A
{
    public static void main(String[] args)
    {
        String str1 = new String("China");
        String str2 = new String("China");
        System.out.println(str1.equals(str2));//String 中equals 比较的是str所指向的new String()中的
                                              //  china
        if(str1 == str2)                      //==比较的是str本身的值
            System.out.println("str1 == str2");
        else
            System.out.println("str1 != str2");
        String str3 = "china";
        String str4 = "china";
        if(str3 == str4)
            System.out.println("str3 == str4");
        else
            System.out.println("str3 != str4");

    }
}
//结果 true
//str1 != str2
//str3 == str4
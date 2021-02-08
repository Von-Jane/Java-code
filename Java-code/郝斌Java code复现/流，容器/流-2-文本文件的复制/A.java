import java.io.*;
public  class A
{
    public static void main(String[] args)throws Exception
    {
        FileReader fr = new FileReader("C:\\Users\\11692\\IdeaProjects\\流-2\\src\\A.java");
        FileWriter fw = new FileWriter("C:\\Users\\11692\\IdeaProjects\\流-2\\src\\复制A.java");
        int ch;
        ch = fr.read();

        while(-1 != ch)
        {
            fw.write(ch);
            ch = fr.read();
        }
        fw.flush();
        fr.close();
        fw.close();
    }
}
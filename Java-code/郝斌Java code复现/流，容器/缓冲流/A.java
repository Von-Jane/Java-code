import java.io.*;
public class A
{
     public static void main(String[] args) throws IOException
    {
        BufferedInputStream bis = new BufferedInputStream( new FileInputStream("D:\\CloudMusic\\Deep Side - Booty Music.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\11692\\IdeaProjects\\缓冲流\\src\\复制-A.mp3"));
        byte[] buf = new byte[1024];
        int len;
        len = bis.read(buf);
        while(-1!=len)
        {
            bos.write(buf,0,len);
            len = bis.read(buf);
        }
        bos.flush();
        bos.close();
        bis.close();
    }
}


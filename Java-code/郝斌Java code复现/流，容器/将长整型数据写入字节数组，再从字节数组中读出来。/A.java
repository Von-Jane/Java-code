import java.io.*;
public class A
{
    public static void main(String[] args)throws Exception
    {
        long m = 1234567;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(baos);
        dos.writeLong(m);
        dos.flush();

        byte[] buf = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
        DataInputStream dis = new DataInputStream(bais);
        long n;
        n = dis.readLong();
        System.out.printf("n=%d\n",n);


    }
}
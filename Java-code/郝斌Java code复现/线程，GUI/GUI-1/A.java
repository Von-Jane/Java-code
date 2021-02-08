import java.awt.*;
import java.awt.event.*;
class M
{
    public static void main(String[] args)
    {
        Frame f = new Frame();
        Button bn = new Button("ok");
        f.add(bn);

        A aa = new A();
        bn.addActionListener(aa);

        B bb = new B();
        f.addWindowListener(bb);

        f.pack();
        f.setVisible(true);
    }
}
class B extends WindowAdapter
{
    public void windowClosing(WindowEvent e)
    {
        System.exit(-1);
    }
}
class A implements ActionListener
{
    public void actionPerformed(ActionEvent e)
    {
        System.out.println("今天很开心！");
    }
}

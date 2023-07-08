import javax.swing.*;
import java.awt.*;

public class Topic32 {

    public static void main(String[] args) {

        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.cyan);
        label1.setBounds(50,50,100,100);

        JLabel label3=new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.black);
        label3.setBounds(150,150,100,100);


        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.blue);
        label2.setBounds(100,100,100,100);
        JLayeredPane layer=new JLayeredPane();
        layer.setBounds(00,0,500,500);
        layer.add(label1);
        layer.add(label2);
        layer.add(label3);

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(500,500));
        frame.setLayout(null);
        frame.add(layer);
        frame.setVisible(true);
    }
}

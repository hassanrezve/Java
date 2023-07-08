import javax.swing.*;
import java.awt.*;

public class Topic28 {
    public static void main(String[] args) {


        JPanel panel1=new JPanel();
        panel1.setBackground(Color.GREEN);
        panel1.setBounds(0,0,200,200);

        JPanel panel2=new JPanel();
        panel2.setBackground(Color.ORANGE);
        panel2.setBounds(200,0,200,200);

        JPanel panel3=new JPanel();
        panel3.setBackground(Color.blue);
        panel3.setBounds(0,200,400,400);

        JLabel label=new JLabel();
        label.setBackground(Color.darkGray);
        label.setOpaque(true);
        label.setText("hassan rezve");
        label.setLayout(new BorderLayout());
        label.setVerticalAlignment(JLabel.TOP);
        label.setHorizontalAlignment(JLabel.CENTER);

        panel3.add(label);
        ImageIcon icon=new ImageIcon("1.png");

        JFrame frame =new JFrame();
        frame.setTitle("My new Frame");
        frame.setIconImage(icon.getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
    }
}

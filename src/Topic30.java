import javax.swing.*;
import java.awt.*;

public class Topic30 {

    public static void main(String[] args) {
        JPanel panel=new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(200,200));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));
        panel.add(new JButton("!"));

        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.add(panel);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Topic27 {
    public static void main(String[] args) {
        Border border= BorderFactory.createLineBorder(Color.green,4);
        JLabel label=new JLabel();
        label.setText("Instagram");
        ImageIcon icon = new ImageIcon("1.png");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setIcon(icon);
        label.setForeground(new Color(221,111,23));
        label.setFont(new Font("MV Boli",Font.PLAIN,30));
        label.setIconTextGap(200);
        label.setBackground(Color.ORANGE);
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(0,0,250,250);
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
//      frame.setLayout(null);
        frame.add(label);
        frame.pack();

    }
}

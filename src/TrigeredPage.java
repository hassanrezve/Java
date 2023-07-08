import javax.swing.*;
import java.awt.*;

public class TrigeredPage {

    JFrame frame=new JFrame();
    JLabel label=new JLabel();
    TrigeredPage()
    {
        label.setOpaque(true);
        label.setBackground(Color.GREEN);
        label.setText("hello!");
        label.setFont(new Font(null,Font.PLAIN,30));
        label.setBounds(100,100,200,200);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaunchPage implements ActionListener {
    JFrame frame=new JFrame();
    JButton btn=new JButton("open new tab");
    LaunchPage()
    {
        btn.setBounds(150,200,200,30);
        btn.setFocusable(false);
        btn.addActionListener(this);
        frame.add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
           if( e.getSource()==btn)
           {
               frame.dispose();
               TrigeredPage triger=new TrigeredPage();
           }
    }
}

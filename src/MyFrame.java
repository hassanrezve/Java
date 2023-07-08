import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;


public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JLabel label;
    MyFrame() {
        ImageIcon btnicon=new ImageIcon("1.png");

        label=new JLabel();
        label.setText("my name is hassan");
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Comic sans",Font.BOLD,25));
        label.setBounds(100,150,200,250);
        label.setVisible(false);


        button = new JButton();
        button.setText("I am Button!");
        button.setIcon(btnicon);
        button.setBounds(200,100,200,150);
        button.setFont(new Font("Comic sans",Font.BOLD,25));
        button.setForeground(Color.RED);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.CENTER);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.addActionListener(this);
        button.setBackground(Color.LIGHT_GRAY);

        ImageIcon frameIcon=new ImageIcon("1.png");
        this.setSize(500,500);
        this.setIconImage(frameIcon.getImage());
        this.setLayout(null);
        this.setTitle("New Frame");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(button);
        this.add(label);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            System.out.println("hello Mf");
            label.setVisible(true);
        }
    }
}

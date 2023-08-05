import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame implements ActionListener {
    JRadioButton button1;
    JRadioButton button2;
    JRadioButton button3;
    ImageIcon icon1;
    ImageIcon icon2;
    ImageIcon icon3;
    ImageIcon icon = new ImageIcon("t.png");
    RadioButtonFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

   button1= new JRadioButton("pizza");
   button2= new JRadioButton("burgur");
   button3= new JRadioButton("shawarma");
     icon1 = new ImageIcon("x.png");
     icon2 = new ImageIcon("x.png");
     icon3 = new ImageIcon("x.png");

     button1.setIcon(icon1);
     button2.setIcon(icon2);
     button3.setIcon(icon3);
        ButtonGroup group =new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        this.setSize(new Dimension(400,400));
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1)
        {
            System.out.println("u ordered pizza");
            button1.setIcon(icon);

        } else if (e.getSource()==button2) {
            System.out.println("u ordered burger");
            button2.setIcon(icon);
        } else if (e.getSource()==button3) {
            System.out.println("u ordered shawarma");
            button3.setIcon(icon);
        }
    }
}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checkboxframe extends JFrame implements ActionListener {
    JCheckBox cbox;
    ImageIcon xicon;
    ImageIcon ticon;
    JButton button = new JButton();
    Checkboxframe(){
        button.setText("submit");
        button.addActionListener(this);
        button.setFocusable(false);

        xicon=new ImageIcon("x.png");
        ticon=new ImageIcon("t.png");

        cbox=new JCheckBox();
        cbox.setText("i am human");
        cbox.setFocusable(false);
        cbox.setFont(new Font("Consolas",Font.PLAIN,30 ));
        cbox.setIcon(xicon);
        cbox.setSelectedIcon(ticon);

        this.add(cbox);
        this.add(button);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(400,400));
        this.setVisible(true);


    }



    @Override
    public void actionPerformed(ActionEvent e) {
            if(e.getSource()==button)
            {
                System.out.println(cbox.isSelected());
            }
    }
}

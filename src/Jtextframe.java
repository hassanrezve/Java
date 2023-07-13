import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtextframe extends JFrame implements ActionListener {

     JTextField textbox;
    static JButton button;

    Jtextframe() {
        button = new JButton();
        button.addActionListener(this);
        button.setText("hello");
        textbox = new JTextField();
        textbox.setPreferredSize(new Dimension(200,40));
        textbox.setFont(new Font("Consolas",Font.PLAIN,30));
        textbox.setForeground(new Color(0X00FF00));
        textbox.setBackground(Color.BLACK);
        textbox.setCaretColor(Color.cyan);
        textbox.setText("username");

        this.add(textbox);
        this.add(button);
        this.setLayout(new FlowLayout());
        this.setSize(new Dimension(400,400));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

          this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button)
        {
            textbox.setEditable(false);
            button.setEnabled(false);
            System.out.println("welcome "+textbox.getText());
        }
    }
}

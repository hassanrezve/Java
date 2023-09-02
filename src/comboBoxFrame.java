import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class comboBoxFrame extends JFrame implements ActionListener {
    JComboBox box;
    comboBoxFrame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.pack();

        //comboBox.setEditable(true);
        //System.out.println(comboBox.getItemCount());
        //comboBox.addItem("horse");
        //comboBox.insertItemAt("pig", 0);
        //comboBox.setSelectedIndex(0);
        //comboBox.removeItem("cat");
        //comboBox.removeItemAt(0);
        //comboBox.removeAllItems();
        String[] animal={"dog","horse","cat"};
        box=new JComboBox(animal);
        box.addActionListener(this);
        this.add(box);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
                if(e.getSource()==box)
                {
                    System.out.println(box.getSelectedItem());
                }
    }
}

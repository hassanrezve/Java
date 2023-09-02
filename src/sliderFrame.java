import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class sliderFrame implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    sliderFrame()
    {
        frame =new JFrame("Slider frame");
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(200,200));
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(25);
        slider.setPaintLabels(true);
        slider.setPaintTrack(true);
        slider.setFont(new Font("MV boli",Font.PLAIN,20));
        slider.setOrientation(1);
        slider.setMinorTickSpacing(10);
        slider.addChangeListener(this);
        label.setText(("C = "+slider.getValue()));
        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText(("C = "+slider.getValue()));
    }
}

import javax.swing.*;

public class Topic1 {
    public static void main(String[] args) {
        String name= JOptionPane.showInputDialog("Enter your Name");
        int age=Integer.parseInt( JOptionPane.showInputDialog("Enter ur age"));
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter Your height"));
        JOptionPane.showMessageDialog(null,"hello "+name +"\n"+"Your are this :"+age+" years old \n"+"Your hieght is this:"+height+"cm");
    }
}

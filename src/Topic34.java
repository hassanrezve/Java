import javax.swing.*;

public class Topic34 {
    public static void main(String[] args) {

//        JOptionPane.showMessageDialog(null,
//                "hello brother","info",
//                JOptionPane.PLAIN_MESSAGE);
//        JOptionPane.showMessageDialog(null,
//                "hello brother","info",
//                JOptionPane.INFORMATION_MESSAGE);
//        JOptionPane.showMessageDialog(null,
//                "hello brother","info",
//                JOptionPane.QUESTION_MESSAGE);
//                JOptionPane.showMessageDialog(null,
//                "hello brother","info",
//                JOptionPane.WARNING_MESSAGE);
//                JOptionPane.showMessageDialog(null,
//                "hello brother","info",
//                JOptionPane.ERROR_MESSAGE);
//        while (true)
//        {
//            JOptionPane.showMessageDialog(null,"hello motherfucker",
//                    "Info",JOptionPane.ERROR_MESSAGE);
//        }
//        JOptionPane.showConfirmDialog(null,
//                "are u sure sucker","ok",JOptionPane.YES_NO_CANCEL_OPTION);

//        String name=JOptionPane.showInputDialog("what is your name");
//        System.out.println("hello "+name);

        String[] responses={"do u know me","yes","no"};
        ImageIcon icon=new ImageIcon("1.png");
        JOptionPane.showOptionDialog(null,"awosome","secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,
                icon,responses,0);
    }

}

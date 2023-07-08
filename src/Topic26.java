import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Topic26 {

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        File file= new File("1.wav");
        AudioInputStream audio= AudioSystem.getAudioInputStream(file);
        Clip clip=AudioSystem.getClip();
        clip.open(audio);
        Scanner sc=new Scanner(System.in);
        String n="";
        while (!n.equals("q"))
        {
            System.out.println("Enter P=PLay Q=Quit S=Stop R=Reset");
            n=sc.next();
            n=n.toLowerCase();
            switch (n)
            {
                case "p":
                    clip.start();
                    break;
                case "s":
                    clip.stop();
                    break;
                case "r":
                    clip.setMicrosecondPosition(0);
                    break;
                case "q":
                    clip.close();
                    break;
                default:

                    System.out.println("Enter Valid Option");

            }
        }
    }
}

import java.io.FileWriter;

public class Topic24 {

    public static void main(String[] args) {
        try
        {
            FileWriter file = new FileWriter("hassan.txt");
            file.write("my name is hassan raza rizve");
            file.append("this is my name");
            file.close();

        }
        catch(Exception e)
        {

        }
    }}

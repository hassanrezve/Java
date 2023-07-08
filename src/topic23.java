import java.io.File;

public class topic23 {

    public static void main(String[] args) {
        File f=new File("C:\\Users\\Rana Computer\\IdeaProjects\\LearningJava\\src\\hassan.txt");
        if(f.exists())
        {
            System.out.println(f.getPath());
            System.out.println(f.getAbsolutePath());
            System.out.println(f.isFile());
            System.out.println("file exsists");
        }
        else {
            System.out.println("find not found");
        }

//        f.delete() it wil delte the file can give the name aalso in function
    }
}

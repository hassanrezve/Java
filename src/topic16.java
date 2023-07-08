public class topic16 {
    public static void main(String[] args) {
        channels c=new channels();
        c.go();
        //cam not make an object of class abstract amd abstract methods in the class must be implemnted
    }

}


abstract class tv
{
    abstract void go();
}
class channels extends tv{
    channels()
    {
        System.out.println("helo");
    }
    void go()
    {
        System.out.println("lets go");
    }
}
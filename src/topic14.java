public class topic14 {
    public static void main(String[] args) {
        Care a1=new Care();
        a1.go();
    }
}

class vehicale
{
    double speed;
    void go()
    {
        System.out.println("tihs vehacle is running");
    }
    void stop()
    {
        System.out.println("vehacle stopped");
    }
}

class Care extends vehicale
{

}
class bike extends vehicale
{

}
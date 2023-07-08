public class topic20 {
    public static void main(String[] args) {
        Caree c=new Caree();
        Boat b=new Boat();
        Cycle a= new Cycle();

        Vehcle[] objects={c,b,a};
        objects[0].start();
    }

}

class Vehcle
{
    void start()
    {
        System.out.println("this vehacle is started");
    }
    void stop()
    {
        System.out.println("this vehcle is stopped");
    }
}
class Caree extends Vehcle
{

}
class Boat extends Vehcle {

}
class Cycle extends Vehcle {

}
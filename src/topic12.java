public class topic12 {
    public static void main(String[] args) {
        Carr c= new Carr("Tesla");
        Garage g=new Garage(c);
    }
}

class Carr
{
    String name;
    Carr(String name)
    {
        this.name=name;
    }
}
class Garage
{
    Garage(Carr car)
    {
        System.out.printf("This %s is parked",car.name);
    }
}

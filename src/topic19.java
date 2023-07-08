public class topic19 {
}

interface Run
{
    void runn();
}
interface walk
{
    void walk();
}
class humann implements walk,Run
{
    public void walk()
    {
        System.out.println("walk");
    }
    public void runn()
    {
        System.out.println("run");
    }
}

public class topic9 {

    public static void main(String[] args) {
        Pizza order=new Pizza("thin crust");
        System.out.println("your following order is preparing");
        System.out.println(order.bread);
        System.out.println(order.sauce);
        System.out.println(order.cheeze);
        System.out.println(order.topping);
    }

}
class Pizza
{
    String bread,sauce,cheeze,topping;
    Pizza(String bread)
    {
        this.bread=bread;
    }
    Pizza(String bread,String sauce)
    {
        this.bread=bread;
        this.sauce=sauce;
    }
    Pizza(String bread,String sauce,String cheeze)
    {
        this.bread=bread;
        this.sauce=sauce;
        this.cheeze=cheeze;
    }
    Pizza(String bread,String sauce,String cheeze,String topping)
    {
        this.bread=bread;
        this.sauce=sauce;
        this.cheeze=cheeze;
        this.topping=topping;
    }
}

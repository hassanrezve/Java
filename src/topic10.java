public class topic10 {
    public static void main(String[] args) {
        Car car=new Car();
        System.out.println(car);   // this default runs the toString() function like car.toString(); will give the adress in mem
    }
}
class Car
{
    String Name="honda";
    String model="2000";

    public String toString()
    {
        String str="i am overriiding the toString function";
        return str;
    }

}


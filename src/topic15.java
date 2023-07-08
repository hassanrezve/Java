public class topic15 {
    public static void main(String[] args) {

        hero h1=new hero("batman","moneyy",54);
        System.out.println(h1.data());
    }
}

class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public String info()
    {
        return this.name+" "+this.age;
    }
}
class hero extends person {
    String power;

    hero(String name, String power, int age) {
        super(name, age);
        this.power = power;


    }

    public String data() {
        return super.info() + " " + this.power;
    }
}
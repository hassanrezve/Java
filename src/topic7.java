public class topic7 {

    public static void main(String[] args) {
        Human hassan=new Human("rezve",19,80);
        hassan.changeName("hassan");
        hassan.info();
    }
}
class Human
{
    String name;
    int age;
    double weight;
    Human(String name,int age,double weight)
    {
        this.name=name;
        this.age=age;
        this.weight=weight;
    }
    void info()
    {
        System.out.println("this person name is :"+this.name);
        System.out.println("the age is :"+this.age);
        System.out.println("this person weight is :"+this.weight);
    }
    void changeName(String name)
    {
        this.name=name;
    }
}
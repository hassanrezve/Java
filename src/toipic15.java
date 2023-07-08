public class toipic15 {
    public static void main(String[] args) {
        Dog tom=new Dog();
        tom.speak();
    }
}

class Animal
{
    void speak()
    {
        System.out.println("this animal is speaking");
    }
}
class Dog extends Animal
{
    void speak()
    {
        System.out.println("the dog goes bark");
    }
}

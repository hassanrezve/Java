import java.util.Scanner;

public class topic21 {

    public static void main(String[] args) {
        Animall animal;
        Scanner sc=new Scanner(System.in);
        System.out.println("press (1=Dog) or (2=cat)");
        int Choice=sc.nextInt();
        switch (Choice)
        {
            case 1:
            {
                animal=new Dogy();
                animal.speak();
                break;
            }
            case 2:
            {
                animal=new catt();
                animal.speak();
                break;
            }
            default:
            {
                animal=new Animall();
                animal.speak();
                break;
            }
        }

    }
}

class Animall
{
    void speak()
    {
        System.out.println("Animal Speaks *wooooooo");
    }
}
class Dogy extends Animall
{
    void speak()
    {
        System.out.println("dogs barks");
    }
}
class catt extends Animall
{

    void speak()
    {
        System.out.println("cats does meow");
    }
}

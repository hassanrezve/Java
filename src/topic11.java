public class topic11 {
    public static void main(String[] args) {
        Food fridge=new Food("Pizza");
        Food fridge1=new Food("burger");
        Food fridge2=new Food("allo");

        Food[] freeze=new Food[3];
        freeze[0]=fridge;
        freeze[1]=fridge1;
        freeze[2]=fridge2;

        System.out.println(freeze[0].name);
    }
}

class Food
{
    String name;
    Food(String name)
    {
        this.name=name;
    }
}

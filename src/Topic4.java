import java.util.ArrayList;

public class Topic4 {
    public static void main(String[] args) {

        ArrayList<String> drinks=new ArrayList<String>();
        drinks.add("coke");
        drinks.add("pepsi");
        drinks.add("Sting");

        ArrayList<String> food=new ArrayList<>();
        food.add("pizza");
        food.add("biryani");
        food.add("Meat");
        food.add("Chicken");
        ArrayList<ArrayList<String>> groceries=new ArrayList<>(); ///2 dimenstional arraylist
        groceries.add(food);
        groceries.add(drinks);
        System.out.println(groceries.get(0).get(1)); //boom done
    }
}

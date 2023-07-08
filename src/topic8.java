import java.util.Random;

public class topic8 {
    public static void main(String[] args) {
        DiceRoller roll=new DiceRoller();
    }
}
class DiceRoller {
    Random random;
    int number;

    DiceRoller() {
        this.random = new Random();
        this.number = 0;
        Roll();
    }

    void Roll() {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
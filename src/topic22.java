import java.util.InputMismatchException;
import java.util.Scanner;

public class topic22 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try {
            System.out.println("enter 1st number to divide");
            int a = sc.nextInt();
            System.out.println("enter 2nd number to divide");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("the result is :" + c);
        }
        catch (InputMismatchException e)
        {
            System.out.println("Enter a number Idot");
        }
        catch (ArithmeticException e)
        {
            System.out.println("u cant divide with a number with zero bitch");
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("i will run anyway beacause i am final");
        }
    }
}

import java.util.Scanner;

public class Topic2 {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        System.out.println("program to knwo the hypothinoies of a triangle");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of side 1:");
        x=sc.nextDouble();
        System.out.println("Enter the Value of 2nd Side :");
        y=sc.nextDouble();
        z=Math.sqrt((x*x)+(y*y));
        System.out.println("the third side is :"+z);
    }
}

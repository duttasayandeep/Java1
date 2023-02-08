import java.util.Scanner;

public class Sum {
    public static void main(String args[])
    {
        double x, y, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number = ");
        x = sc.nextDouble();
        System.out.println("Enter the second number = ");
        y = sc.nextDouble();
        sum = x + y;
        System.out.println("The sum of the two numbers is = " + sum);



    }



}

import java.util.*;
public class Operation {
    public static void main(String args[]){
        int num, a, b, sum, prod, div, sub;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number for operation = ");
        a = sc.nextInt();
        System.out.println("Enter the second number for operation = ");
        b = sc.nextInt();
        System.out.println("Enter 1 to perform addition");
        System.out.println("Enter 2 to perform subtraction");
        System.out.println("Enter 3 to perform multiplication");
        System.out.println("Enter 4 to perform division");
        num = sc.nextInt();

        switch(num)

        {
            case 1:
                sum = a+b;
                System.out.println("The sum is = " + sum);
                break;
            case 2:
                sub = a-b;
                System.out.println("The difference is = " + sub);
                break;
            case 3:
                prod = a*b;
                System.out.println("The product is = " + prod);
                break;
            case 4:
                div = a/b;
                System.out.println("The quotient is = " + div);
                break;
            default:
                System.out.println("You have entered the wrong choice");
        }

    }
}

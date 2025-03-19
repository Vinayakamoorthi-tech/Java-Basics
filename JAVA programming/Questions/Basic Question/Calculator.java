import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Enter the corresponding number to perform the operation");
        System.out.println("1-->Addition");
        System.out.println("2-->Subtraction");
        System.out.println("3-->Multiplication");
        System.out.println("4-->Division");
        int opr=sc.nextInt();
        switch (opr) {
            case 1:
                int c =a+b;
                System.out.println("The sum of the number is "+c);
                break;
            case 2:
                int d =a-b;
                System.out.println("The difference of the number is "+d);
                break;
            case 3:
                int p =a*b;
                System.out.println("The product of the number is "+p);
                break;
            case 4:
                int di = a/b;
                System.out.println("The division of the number is "+di);
            default:
                System.out.println("Invalid operation number enter correct number");
                break;
        }
    }
}


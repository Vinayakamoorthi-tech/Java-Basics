import java.util.Scanner;
public class LargestOfThree {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter your First number");
                int a=sc.nextInt();
                System.out.println("Enter your second number");
                int b=sc.nextInt();
                System.out.println("Enter the third number");
                int c=sc.nextInt();
                System.out.println("Largest : " + ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c)));
        
            
        
    }
}

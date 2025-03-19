import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check odd or even");
        int n = sc.nextInt();
        if((n & 1) == 0){
            System.out.println("The number "+n+" is even");
        }
        else{
            System.out.println("The number "+n+" is odd");
        }
    }
    
}

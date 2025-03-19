import java.util.Scanner;
public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("The number "+num+" is positive");
        }
        else if(num<0){
            System.out.println("The number "+num+" is negative");
        }
        else{
            System.out.println("The number is 0");
        }
    }
    
}

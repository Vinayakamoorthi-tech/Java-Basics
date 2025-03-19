import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of 3 side of the triangle");
        int l1=sc.nextInt();
        int l2=sc.nextInt();
        int l3=sc.nextInt();
        if( l1 == l2 && l1==l3){
            System.out.println("The triangle is Equilateral triangle");
        }
        else if(l1 == l2 || l1 == l3 || l2 == l3){
            System.out.println("The triangle is Isosceles triangle");
        }
        else{
            System.out.println("The triangle is Scalene triangle");
        }
        
    }
}

import java.util.Scanner;
public class OneD{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size ?");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter Array elements?");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            System.out.println(arr[i]+" ");
        }
    }
}

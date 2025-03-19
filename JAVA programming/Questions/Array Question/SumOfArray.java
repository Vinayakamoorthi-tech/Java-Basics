import java.util.Scanner;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element of array");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target number to sum array");
        int sum=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("("+arr[i]+","+arr[j]+")");
                }
            }
        }
    }
}

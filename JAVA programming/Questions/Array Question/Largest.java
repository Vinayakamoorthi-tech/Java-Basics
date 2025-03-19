import java.util.Scanner;
public class Largest{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array?");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element in array?");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    max = arr[j];
                }
            }
        }
        System.out.println("Largest = "+max);
    }
}
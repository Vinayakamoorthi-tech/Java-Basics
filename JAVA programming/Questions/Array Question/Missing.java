import java.util.Scanner;
public class Missing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array?");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element in array?");
        int arr2[]=new int[size+1];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=arr2.length;i++){
            arr2[i-1]=i;
        }
        for(int i=0;i<arr2.length;i++){
            if(arr[i]!=arr2[i]){
                System.out.println("The missing number is "+arr2[i]);
                break;
            }
        }
    }
}

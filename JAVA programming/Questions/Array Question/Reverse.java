import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of the array?");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element in array?");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int left=0, right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}

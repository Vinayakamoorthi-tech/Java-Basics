import java.util.Scanner;

public class TwoD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row?");
        int row=sc.nextInt();
        System.out.println("Enter the size of coloumn?");
        int col=sc.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter Array elements?");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){//the arr[i].length is use to get the length of the coloumn.
                arr[i][j]=sc.nextInt();   
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
    
    }
}

public class JaggedArray {
    public static void main(String[] args) {
        int n=5;
        int [][] arr=new int [n][];
        arr[0]=new int [3];
        arr[1]=new int [2];
        arr[2]=new int [n-1];
        arr[3]=new int [n];
        arr[4]=new int [0];


        arr[0][2]=10;//it is the value of first row's 2nd column
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){//[i]is given for the partical row length
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}

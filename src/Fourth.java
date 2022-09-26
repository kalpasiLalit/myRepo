import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
    public static void main(String[] args) {
        int row;
        int column;

        Scanner in = new Scanner(System.in);
        System.out.println("enter number of rows: ");
        row = in.nextInt();
        System.out.println("enter number of columns: ");
        column = in.nextInt();
        int[][] array = new int[row][column];
        //array input
        for(int i=0;i < row;i++){

            for(int j =0; j< column;j++){
                array[i][j] = in.nextInt();

            }
        }
        //printing array
        for(int i=0;i < row;i++){

            for(int j =0; j< column;j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        Fourth obj = new Fourth();

        int[]  colSum = obj.sumOfCol(row,column,array);
        System.out.println("sum of each column: "+ Arrays.toString(colSum));
        int[]  rowSum = obj.sumOfRow(row,column,array);
        System.out.println("sum of each row: " + Arrays.toString(rowSum));


    }
    public int[] sumOfRow(int r,int c,int[][] arr){
        int[] rowSum = new int[r];
        for(int i=0;i < r;i++){
            int sum =0;
            for(int j =0; j< c;j++){
                sum+= arr[i][j];
                rowSum[i] = sum;

            }
        }
        return rowSum;
    }

    public int[] sumOfCol(int r,int c,int[][] arr){
        int[] colSum = new int[c];
        for(int i=0;i < c;i++){
            int sum =0;
            for(int j =0; j< r;j++){
                sum+= arr[j][i];
                colSum[i] = sum;

            }
        }
        return colSum;
    }
}

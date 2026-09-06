package arraysBasic.array2d;
import java.util.Scanner;

public class jaggedArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        // Enter values for rows
        System.out.println("Enter the row value");
        int row = sc.nextInt();
        int [][] arr = new int[row][];
        // enter values for column
        for(int i = 0; i<row; i++){
            System.out.println("enter the value of column for row = "+i);
            int col = sc.nextInt();
            arr[i] = new int[col];

        }
        // Array length
        System.out.println("total row = "+arr.length);
        for(int i=0; i< arr.length; i++){
            System.out.println("Row = "+i+" columns = "+arr[i].length);
        }


        // input values for jagged array
        for(int i=0; i<arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.println(i+" = Row values, and enter the value for column = "+j);
                arr[i][j] = sc.nextInt();
            }
        }
        // print the array
        for(int i =0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }

    }
}

package arraysBasic.array2d;
import java.util.*;
public class InputAndPrint2DArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("No. of rows");
        int row = sc.nextInt();
        System.out.println("No. of Colums");
        int col = sc.nextInt();
        int arr[][]=new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++) {
                System.out.println(" Enter the value for Row = " + i + " colum = " + j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The given values = ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}

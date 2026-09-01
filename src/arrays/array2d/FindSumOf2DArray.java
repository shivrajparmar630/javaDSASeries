package arrays.array2d;
import java.util.*;
public class FindSumOf2DArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row value ");
        int row = sc.nextInt();
        System.out.println("Enter columns values ");
        int col = sc.nextInt();
        int matrix [][] = new int [row][col];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.println("Enter the value for row = "+i+" And Column = "+j);
                matrix[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                sum = sum + matrix[i][j];
            }
        }
        System.out.println("Sum of all matrix is = "+sum);

    }
}

package arrays.array2d;
import java.util.*;
public class CountEvenOddIn2DArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Row");
        int row = sc.nextInt();
        System.out.println("Column");
        int col = sc.nextInt();
        int [][] matrix = new int[row][col];
        for(int i = 0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.println("Enter the index of Row = "+i+" Column = "+j);
                matrix[i][j]=sc.nextInt();
            }
        }
        int odd =0;
        int even = 0;

        for (int i=0; i<matrix.length; i++ ){
            for(int j=0; j< matrix[i].length; j++){
                if(matrix[i][j]%2 == 0){
                    even++;
                }
                else {
                    odd++;
                }
            }
        }
        System.out.println("Even = "+even);
        System.out.println("Odd = "+odd);
    }
}

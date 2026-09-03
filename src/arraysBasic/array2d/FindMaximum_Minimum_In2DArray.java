package arraysBasic.array2d;
import java.util.*;

public class FindMaximum_Minimum_In2DArray {
    static void main() {
// Minimum of matrix code
        Scanner sc = new Scanner(System.in);
        System.out.println("Row");
        int row = sc.nextInt();
        System.out.println("Columns");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        for(int i=0; i<matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                System.out.println("Enter value for Row = "+i+" Column = "+j);
                matrix[i][j]=sc.nextInt();
            }
        }
        int min = matrix[0][0];
        for(int i = 0; i< matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){
                if(min>matrix[i][j]){
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum value of the matrix, is = "+min);


    }

}


// Maximum of the matrix code

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Row");
//        int row = sc.nextInt();
//        System.out.println("Columns");
//        int col = sc.nextInt();
//        int[][] matrix = new int[row][col];
//        for(int i=0; i<matrix.length; i++){
//            for(int j = 0; j<matrix[i].length; j++){
//                System.out.println("Enter value for Row = "+i+" Column = "+j);
//                matrix[i][j]=sc.nextInt();
//            }
//        }
//        int max = matrix[0][0];
//        for(int i = 0; i< matrix.length; i++){
//            for(int j = 0; j< matrix[i].length; j++){
//                if(max<matrix[i][j]){
//                    max = matrix[i][j];
//                }
//            }
//        }
//        System.out.println("Maximum value of the matrix, is = "+max);
//
//
//
//
//    }
//
//}
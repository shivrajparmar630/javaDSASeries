package conditions;

public class number {
    static void main() {

        //count 
//        int n=5;
//        int count=1;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                if(col==1){
//                    System.out.print(count);
//                    count++;
//                }
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }
//        int n=4;
//
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(n-row); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=row; col++ ){
//                    System.out.print(col+" ");
//            }
//            for(int col=(row-1); col>=1; col--){
//                System.out.print(col+" ");
//            }
//            System.out.println();
//        }

        //pyramid 1,22,333

//        int n=4;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(n-row); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=(2*row-1); col++){
//                System.out.print(row+" ");
//            }
//            System.out.println();
//        }

        // 1 to 15 +1st col 1 to 5

//        int n=5;
//        int c=1;
//        int count=1;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                if(col==1){
//                    System.out.print(count);
//                    count++;
//                }
//                System.out.print(c+" ");
//                c++;
//            }
//            System.out.println();
//        }





//Spiral Matrix Pattern


        int n = 4;

        for (int row = 0; row < n; row++) {

            for (int col = 0; col < n; col++) {

                int layer = Math.min(
                        Math.min(row, col),
                        Math.min(n - 1 - row, n - 1 - col)
                );

                int size = n - 2 * layer;

                int start = n * n - size * size + 1;

                int value;

                if (row == layer) {
                    // Top → Right
                    value = start + (col - layer);
                }
                else if (col == n - 1 - layer) {
                    // Top → Bottom
                    value = start + (size - 1) + (row - layer);
                }
                else if (row == n - 1 - layer) {
                    // Right → Left
                    value = start + 2 * (size - 1)
                            + (n - 1 - layer - col);
                }
                else {
                    // Bottom → Top
                    value = start + 3 * (size - 1)
                            + (n - 1 - layer - row);
                }

                System.out.print(value + "\t");
            }

            System.out.println();
        }
    }
}

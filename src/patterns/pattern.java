package patterns;

public class pattern {
    static void main() {
//        int n = 3;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=5; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}
//    int n = 5;
//    for(int row = 1; row<=n; row++){
//        for(int col=1; col<=n; col++){
//            System.out.print("*  ");
//        }
//        System.out.println();
//    }
//    }
//    }

//        int n = 4;
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= 6; col++) {
//                if (row == 1 || row == n || col==1 || col==6) {
//                    System.out.print("*  ");
//                } else {
//                    System.out.print("   ");
//
//                }
//
//            }
//            System.out.println();
//        }
//
//    }
//}
//int n=5;
//for (int row = 1; row<=n; row++){
//   for (int col=1; col<=(n-row); col++){
//    System.out.print(" ");
//}
//   for(int col=1; col<=5; col++){
//       System.out.print("* ");
//   }
//    System.out.println();
//}
//}
//    }
        //part1
//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= (n - row); col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (2 * row - 1); col++) {
//
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int row = 2; row <= n; row++) {
//
//            for (int col = 1; col <= (row - 1); col++) {
//                System.out.print("  ");
//
//            }
//
//                for (int col = 1; col <= (9 - 2 * row); col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }

//        int n=5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                if(row==1 || row==n || col==1 || col==row){
//                    System.out.print("* ");
//                }
//                else {
//                    System.out.print("  ");
//                }
//            }
//            System.out.println();
//        }

//        int n = 5;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= (n - row); col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (2 * row - 1); col++) {
//                if(row==1 || row==n || col==1 || col==(2 * row - 1)){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//
//
//            }
//            System.out.println();
//        }

//        int n = 4;
//
//        for (int row = 1; row <= n; row++) {
//            for (int col = 1; col <= (n - row); col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (2 * row - 1); col++) {
//                if(row==1 || col==1 || col==(2 * row - 1)){
//                    System.out.print("* ");
//                }
//                else{
//                    System.out.print("  ");
//                }
//
//            }
//            System.out.println();
//        }
//        for (int row = 2; row <= n; row++) {
//
//            for (int col = 1; col <= (row - 1); col++) {
//                System.out.print("  ");
//
//            }
//
//                for (int col = 1; col <= (9 - 2 * row); col++) {
//                    if( row==n || col==1 || col==(9 - 2 * row)) {
//                        System.out.print("* ");
//                    }
//                    else{
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }

//part 1 butter fly
//        int n =4;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            for(int col=1; col<=(8-2*row); col++){
//                System.out.print("  ");
//            }
//
//            for(int col=1; col<=row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        //part 2
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(5-row); col++){
//                System.out.print("* ");
//            }
//            for(int col=1; col<=(2*row-2); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=(5-row); col++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }

//        int n = 4;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(row-1); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=(9-2*row); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int row=2; row<=n; row++){
//            for(int col=1; col<=(n-row); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=(2*row-1); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        int n=9;
        for(int row=1; row<=3; row++){
            for(int col=1; col<=n; col++){
                if(row==1 &&(col==3 || col==7)){
                    System.out.print("* ");
                }
                else if(row==2 &&(col==2 || col==4 || col==6 || col==8)){
                    System.out.print("* ");
                } else if (row==3 &&(col==1 || col==5 || col==9)) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

}
}






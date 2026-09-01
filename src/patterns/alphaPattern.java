package patterns;

public class alphaPattern {
    static void main() {
        //14. Alphabet Triangle Pattern

//        int n=5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=row; col++){
//                char ch=(char) ('A'+col-1);
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//        }

        //15. Inverted Alphabet Triangle Pattern

//        int n=5;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(n-row+1); col++){
//                char ch = (char)('A'+col-1);
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//        }


        //16. Symmetric Alphabet Pyramid Pattern

//        int n=4;
//        for(int row=1; row<=n; row++){
//            for(int col=1; col<=(n-row); col++){
//                System.out.print("  ");
//            }
//            for(int col=1; col<=row; col++){
//                char ch= (char)('A'+col-1);
//                System.out.print(ch+" ");
//            }
//            for(int col=row-1; col>=1; col--){
//                char ch= (char)('A'+col-1);
//                System.out.print(ch+" ");
//            }
//            System.out.println();
//        }


        //17. Reverse Alphabet Right-Angle Triangle Pattern

        int n=5;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                char ch = (char)('E'-col+1);
                System.out.print(ch+" ");
            }
            System.out.println();
        }

    }
}

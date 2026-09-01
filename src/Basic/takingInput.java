package Basic;

import java.util.*;

public class takingInput {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name ");
            String userName = sc.nextLine();
            System.out.println("your target is 50 problems in a week ");
            System.out.println("Enter how many problem you solved in last week  ");
            int solvedProblem = sc.nextInt();

            int targetOfWeek = 50;
            int remainTarget = targetOfWeek - solvedProblem;

            System.out.printf("userName:%s, solvedProblem:%d, remainTarget:%d%n", userName, solvedProblem, remainTarget);

            sc.close();




        }

}

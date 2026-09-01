package conditions;

import java.util.*;
public class ifStatement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age ??");
        int age =sc.nextInt();
        if(age>=18 ){
            System.out.println("you are eligible to vote ");
        }
    }
}

package conditions;

import java.util.*;
public class ifElseStatement {
    static void main() {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter your age ");
        int age = sc.nextInt();
        if( age >= 18 ){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("You are not eligible to vote");
        }
    }
}

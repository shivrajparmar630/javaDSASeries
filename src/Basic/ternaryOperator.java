package Basic;

import java.util.*;
public class ternaryOperator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you conditions.number for know your result");
        int num = sc.nextInt();
        String result = ( num >= 40 )? "Pass Congratulations Buddy": "Fail Better luck next time";
        System.out.println("You are "+ result );
//        if(result=="Pass"){
//            System.out.println("");
//        }
//        else{
//            System.out.println("");
        }
    }


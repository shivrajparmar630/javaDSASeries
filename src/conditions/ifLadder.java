package conditions;

import java.util.*;
public class ifLadder {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age to know your phase");
        int age = sc.nextInt();
        if ( age <=5 ){
            System.out.println("you are a child");
        }
        else if ( age<=18 && age>5 ){
            System.out.println("you are in teenage");
        }
        else if ( age<=30 &&  age >18 ){
            System.out.println("you are a adult");
        }
        else {
            System.out.println("you are the men");
        }


    }
}

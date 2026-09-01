package conditions;

import java.util.*;
public class nextedIfElse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you gender in M and F form ");
        char gender = sc.next().charAt(0);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if ( gender == 'M' ){
            if ( age >= 18 ){
                System.out.println("male can Vote");
            }
            else{
                System.out.println("Male can not Vote");
            }
        }
        else{
            if (age >= 18){
                System.out.println("female can Vote");
            }
            else{
                System.out.println("female can not Vote");
            }

        }
        sc.close();
    }
}

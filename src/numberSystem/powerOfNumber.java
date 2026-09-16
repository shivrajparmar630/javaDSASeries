package numberSystem;

import java.util.Scanner;

public class powerOfNumber {
    static int power(int n, int p){
        int number = 1;
        for(int i =1; i<=p; i++){
            number = number*n;
        }
        return number;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that for power");
        int n = sc.nextInt();
        System.out.println("enter a number that is power");
        int p = sc.nextInt();
        System.out.println(power(n,p));
    }
}

package numberSystem;

import java.util.Scanner;

public class nPrimeNumbers {
    static void prime(int n){
        boolean isPrime = false;
        for( int num=2 ; num<=n; num++){
             isPrime = true;
            for(int i=2; i*i<=num; i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number for 1 to n prime number ");
        int n = sc.nextInt();
        prime(n);
    }
}

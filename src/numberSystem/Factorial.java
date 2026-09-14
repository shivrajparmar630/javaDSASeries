package numberSystem;

public class Factorial {
    static int factorial(int n){
        int fact = 1;
        for(int i=2; i<=n; i++){
            fact = fact*i;
        }
        return fact;

    }

    static void main() {
        int n = 3;
        int fact = factorial(n);
        System.out.println("Factorial of No "+n+" is "+fact);
    }
}

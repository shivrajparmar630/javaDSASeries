package loops;

public class primeNo {
    static void main() {
        for (int j=1; j<=100; j++){

        if (j <= 1) {
            continue;
        } else if (j == 2) {
            System.out.println(j);
        } else {
            boolean isPrime = true;

            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(j);
            }
        }
    }
}}
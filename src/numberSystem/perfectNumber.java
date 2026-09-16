package numberSystem;

public class perfectNumber {
    static boolean perfect(int n) {
        int num = n;
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum = sum + i;
                System.out.print(" " + i);
            }
        }
        System.out.println();
        if (num == sum) {
            return true;
        }
        else {
            return false;
        }
        }

    static void main() {
        int n = 28;
        System.out.println("Number is "+perfect(n));
    }
    }


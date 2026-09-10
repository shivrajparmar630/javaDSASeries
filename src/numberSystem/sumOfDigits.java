package numberSystem;

public class sumOfDigits {
    static int sumOfDigits(int n){
        int sum = 0;
        while (n>0){
            int digits = n%10;
            sum += digits;
            n = n/10;
        }
        return sum;
    }

    static void main() {
        int n = 21356;
        int sum = sumOfDigits(n);
        System.out.println("Sum Of Digits = "+sum);
    }
}

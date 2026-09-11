package numberSystem;

public class reverseNumber {
    static int reverseNumber(int n) {
        int rev = 0;
        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }
        return rev;
    }

    static void main() {
        int n = 98765;
        int reverse = reverseNumber(n);
        System.out.println("reverse Number is = "+reverse);
    }
}

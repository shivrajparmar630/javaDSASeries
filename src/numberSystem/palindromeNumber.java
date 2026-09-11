package numberSystem;

public class palindromeNumber {
    static boolean isPalindrome(int n){
        int rev = 0;
        int num = n;
        while(n>0){
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }

        if(num==rev){
            return true;
        }
        else {
            return false;
        }

    }

    static void main() {
        int n =990099;
        boolean b = isPalindrome(n);
        System.out.println(b);


    }
}

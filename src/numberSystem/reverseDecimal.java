package numberSystem;

public class reverseDecimal {
    static double reverseDecimal(double n){
         n = n*100000;
         int num = (int)n;
         int rev = 0;
         while(num>0){
             int digit = num%10;
             rev = rev*10+digit;
             num = num/10;
         }
        double result = 0;
               result = rev/100000.0;
         return result;
    }

    static void main() {
        double n = 14.53655;
        double reverse = reverseDecimal(n);
        System.out.println("reverse decimal is = "+reverse);
    }
}

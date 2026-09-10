package numberSystem;

public class sumOfDecimalNumber {
    static int sumOfDecimal(double n){
        int IntNum = (int)n;
        double decimalPart = n-IntNum;
         long newNumber = Math.round(decimalPart*100000);
        int sum =0;
        while(newNumber>0){

            long digit = newNumber%10;
            sum = sum + (int)digit;
            newNumber = newNumber/10;

        }
        return sum;
    }

    static void main() {
        double n = 1.34344;
        int sum = sumOfDecimal(n);
        System.out.println("Sum of the decimals = "+sum);
    }
}

package numberSystem;

public class SumOfDouble {
    static int sumOfDouble(double n){
        int sum = 0;
        while(n%1!=0){
            n = n*10;
        }
        while(n>0){
            long digit = (long) n%10;
            sum += digit;
            n = n/10;
        }
        return sum;
    }

    static void main() {
        double n = 13.726556;
        int sum = sumOfDouble(n);
        System.out.println("Sum of the All Numbers = "+sum);
    }
}

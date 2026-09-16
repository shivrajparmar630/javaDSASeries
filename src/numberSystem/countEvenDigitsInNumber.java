package numberSystem;

public class countEvenDigitsInNumber {
    static int digits(int n){
        int count = 0;
        while(n>0){
            int digit = n%10;
            if(digit%2 == 0 ){
                count++;
                System.out.print(" "+digit);
            }
            n=n/10;
        }
        System.out.println();
        return count;
    }

    static void main() {
        int n = 3487634;
        System.out.println("Count is "+digits(n));
    }

}

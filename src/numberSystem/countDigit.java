package numberSystem;

public class countDigit {
    static int Count(long num){
        int count = 0;
        while(num>0){
            count++;
            num = num/10;
        }
        return count;
    }

    static void main() {
        long num = 472347824;
        int count = Count(num);
        System.out.println("Total Digit = "+count);


    }
}

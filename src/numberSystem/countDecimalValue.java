package numberSystem;

public class countDecimalValue {
    static int Decimal(double num){
        int decCount = 0;
        while(num%1!=0){
            num = num*10;
            decCount++;
        }
        return decCount;
    }
    static void main() {
        double num = 15.346456;
        int count = Decimal(num);
        System.out.println("Count = "+count);
    }
}

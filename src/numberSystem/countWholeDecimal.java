package numberSystem;

public class countWholeDecimal {
    static int wholeValue(double num){
        int before = 0;
        int after = 0;
        int total = 0;
        int temp = (int)num;
        while(num%1!=0){
            num = num*10;
            after++;
        }
        while(temp>0){
            before++;
            temp = temp/10;
        }
        total = before+after;
        System.out.println("Before decimal value = "+before);
        System.out.println("After decimal vaule = "+ after);
        return total;
    }
    static void main() {
        double num = 104.43646756;
        int totalCount = wholeValue(num);
        System.out.println("total values = "+totalCount);
    }
}

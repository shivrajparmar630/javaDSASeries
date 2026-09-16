package numberSystem;

public class armstrongNumbers {
    static boolean armNumber(int n ){
        int num = n;
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum = sum+(d*d*d);
            n=n/10;
        }
        if(sum == num){
            return true;
        }
        else {
            return false;
        }
    }

    static void main() {
        int n = 153;
        System.out.println(armNumber(n));
    }
}

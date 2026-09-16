package numberSystem;

public class findLCM {
    static int findLCMValue(int a, int b){
        int x=a;
        int y=b;
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        int LCM = (x*y)/a;
        return LCM;
    }

    static void main() {
        int a=3;
        int b=13;
        System.out.println("the LCM value : "+findLCMValue(a,b));
    }
}

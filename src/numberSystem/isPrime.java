package numberSystem;

public class isPrime {
    static boolean isPrimeNumber(int n){
        boolean prime = true;
        if(n<=1){
            return false;
        }
        else{
            for(int i=2; i*i<=n; i++){
                if(n%i==0){
                    System.out.println(n);
                   return false;
                }
            }
        }
        if(prime){
            System.out.println(n);
            return true;
        }
        else {
            return false;
        }

    }

    static void main() {
        int n = 23;
        System.out.println(isPrimeNumber(n));
    }
}

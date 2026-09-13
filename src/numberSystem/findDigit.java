package numberSystem;

public class findDigit {
    static int findDigits(int n){
        int count=0;

        for(int i = 1; i<=n; i++){
            boolean found = false;
            int temp = i;
            while(temp>0){
                int digit= temp%10;
                if(digit == 6) {
                    count++;
                    found = true;
                }
                if(digit == 9){
                    count++;
                    found = true;
                }
                temp = temp/10;

                }
            if(found){
                System.out.print(i+", ");
                }
            }
        System.out.println();
        return count;
        }

    static void main() {
        int n = 100;
        int count = findDigits(n);
        System.out.println("the count is "+count);
    }
    }

package patterns;

public class newPattern {
    static void main() {
             int n = 6;
        for (int i = 1; i <= n; i++) {

            // Left side numbers
            for (int j = n; j >= 7 - i; j--) {
                System.out.print(j + " ");
            }

            // Stars
            for (int j = 1; j <= n-i; j++) {
                System.out.print("* * ");
            }

            // Right side numbers
            for (int j = 7 - i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
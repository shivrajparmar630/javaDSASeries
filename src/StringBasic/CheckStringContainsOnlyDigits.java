package StringBasic;

import java.util.Scanner;

public class CheckStringContainsOnlyDigits {
    static boolean StringContainsOnlyDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                return false;
            }
        }
            return true;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numerical vaule for check");
        String str = sc.nextLine();
        boolean b = StringContainsOnlyDigits(str);
        System.out.println("the numeric value is "+b);

    }
}

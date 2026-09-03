package StringBasic;

import java.util.Scanner;

public class ConvertStringToUppercaseWithoutMethod {
    static void toUpperCase(String str){
        String newStr = "";
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
               ch = (char)(ch-32);
                newStr += ch;

            }
            else {
                newStr += ch;
            }

        }
        System.out.println("Upper Case = " +newStr);

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String for Upper case ");
        String str = sc.nextLine();
        toUpperCase(str);


    }
}


package StringBasic;

import java.util.Scanner;

public class RemoveAllSpacesFromString {
    static String RemoveAllSpaces(String str){
        String newStr = "";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                continue;
            }
            else{
                newStr += ch;
            }
        }
        return newStr;

    }


    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String for remove spaces ");
        String str = sc.nextLine();
        String newStr = RemoveAllSpaces(str);
        System.out.println("removed spaces string are = "+newStr);

    }
}

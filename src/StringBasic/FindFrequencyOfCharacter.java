package StringBasic;

import java.util.Scanner;

public class FindFrequencyOfCharacter {
    static int FrequencyOfCharacter(String str, char Ch ) {


        int count = 0;
        for (int i = 0; i <str.length(); i++){
            char char1 = str.charAt(i);
            if(char1 == Ch || char1==(char) (Ch-32)){
                count++;
            }
        }
        return count;

    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = "Hello sir my name is Shivraj Singh Parmar, I am living in Greater Noida I block ";
        System.out.println(str);
        System.out.println("Enter A Chatacter to know his frequency ");
        char Ch = sc.next().charAt(0);
        int Count = FrequencyOfCharacter(str,Ch);
        System.out.println("Frequency = "+Count);

    }
}

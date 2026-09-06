package StringBasic;
import java.util.Scanner;

public class countWordsInString {
    static int wordsCount(String str){

        String[] str2 = str.trim().split("\\s+");

        return str2.length;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String for count the words ");
        String str = sc.nextLine();
        int count = wordsCount(str);
        System.out.println("Total words "+count);

    }
}

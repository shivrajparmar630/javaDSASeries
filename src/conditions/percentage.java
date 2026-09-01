package conditions;

import java.util.*;
public class percentage {
 public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you c subject marks");
        int C = sc.nextInt();
        System.out.println("Enter your java subject marks ");
        int java = sc.nextInt();
        System.out.println("Enter your math subject marks ");
        int math = sc.nextInt();
        System.out.println("Enter your english subject marks ");
        int english = sc.nextInt();
        System.out.println("enter your python subject marks");
        int python = sc.nextInt();
        float max = 400;
        int total = C+java+math+english+python;
        System.out.println(total);
        int lowest = C;
        if(java<lowest){
            lowest=java;
        } if (math<lowest) {
            lowest=math;
        } if (english<lowest) {
            lowest=english;

        } if (python<lowest) {
            lowest=python;
        }
        total = total - lowest;
     System.out.println(total);
        float Percentage = (float) total / max *100;
        System.out.println("Your conditions.percentage is "+ Percentage +"%");



//     char word = sc.next().charAt(0);
//    char upperCase = Character.toUpperCase(word);
//    System.out.println("Word is "+ upperCase);
//
//     char lowecase = Character.toLowerCase(word);
//     System.out.println(lowecase);
    }
}

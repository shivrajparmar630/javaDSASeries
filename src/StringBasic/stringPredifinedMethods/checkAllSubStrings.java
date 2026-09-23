package StringBasic.stringPredifinedMethods;

public class checkAllSubStrings {
    static void main() {


        String str = "abcde";
//    int size = str.length();
        for (int i = 0; i < str.length() - 1; i++) {
            for (int j = i + 1; j < str.length(); j++) {
                System.out.print(str.substring(i, j)+" ");
            }
        }
    }
}
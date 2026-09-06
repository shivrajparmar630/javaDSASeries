package StringBasic.stringPredifinedMethods;
import java.util.Locale;

public class predifinedMethods {
    static void main() {
        String str = "  Shivraj Singh Parmar  ";
        String str2 = "SHIVRAJ SINGH PARMAR";
        // .length() method
        System.out.println(str.length());
        // .charAt() method
        System.out.println(str.charAt(6));
        // .substring(start, end) method;
        String sub = str.substring(0,7);
        // .contains() method
        boolean b = str.contains("l");
        // .equal() case sensitive;
        boolean a = str.equals(str2);
        // .equalsIgnoreCase() not case sensitive
        boolean c = str.equalsIgnoreCase(str2);
        // .toUpperCase()
        String up = str2.toUpperCase();
        // .toLowerCase()
        String low = str2.toLowerCase();
        // .trim() remove starting and last apaces
        String st = str.trim();
        // .split() split the String by the given value;
        String[] sc = str.split(" ");
        for(int i=0; i< sc.length; i++){
            System.out.println(sc[i]);
        }
        // .startsWith() case sensitive
        boolean start=str2.startsWith("SHI");
        System.out.println(start);

        // .endsWith() case sensitive
        boolean bb = str.endsWith("r  ");
        System.out.println(bb);

        // .valueOf() premitive to String any data type
        int num = 123;
        String ctr = String.valueOf(num);
        System.out.println(num+2);
        System.out.println(ctr+575);

        // .toCharArray() String to Char[]
        String str3 = "Shivraj";
        char[] Array = str3.toCharArray();
        for(int i=0; i<Array.length; i++){
            System.out.println(Array[i]);

        }

        //.isEmpty() and .isBlank
        String stt = " ";
       boolean emp =  stt.isEmpty();// String ki length 0 hai ya nahi.
       boolean bl = stt.isBlank();// // only whitespace hai ya empty hai
        System.out.println(emp);
        System.out.println(bl );

        // .replace()
        String str4 = str.replace("S","T");
        System.out.println(str4);





    }
}
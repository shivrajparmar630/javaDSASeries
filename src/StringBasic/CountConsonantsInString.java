package StringBasic;

public class CountConsonantsInString {
    static int CountConsonantsInString(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch=='A' || ch=='I' || ch=='O' || ch=='U' || ch=='E'
             ||  ch=='a' || ch=='i' || ch=='o' || ch=='u' || ch=='e' || ch==' '){
                continue;
            }
            else {
                count++;
            }
        }
        return count;
    }
    static void main() {
        String str = "Shivraj Singh Parmar";
       int count = CountConsonantsInString(str);
        System.out.println(count);

    }


}

package StringBasic.stringDSA;

public class findLastWordCount {
    static int lastWordCount(String str){
        String str2 = str.trim();
        int count =0;
        for(int i=str2.length()-1; i>=0; i--){
            if(str2.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }

    static void main() {
        String str = " hello my name is shivraj singh parmar padhori ";
        System.out.println(lastWordCount(str));
    }
}

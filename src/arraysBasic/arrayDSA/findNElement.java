package arraysBasic.arrayDSA;

public class findNElement {
    static boolean findElement(int [] arr, int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }

    static void main() {
        int [] arr = {1,3,4,5,6,78,9,};
        System.out.println(findElement(arr,70));
    }
}

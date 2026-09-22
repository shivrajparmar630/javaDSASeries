package arraysBasic.arrayDSA;

public class reverseOfArray {
    static void reverseArr(int[] arr){
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int n : arr){
            System.out.print(n+" ");
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5};
        reverseArr(arr);
    }
}

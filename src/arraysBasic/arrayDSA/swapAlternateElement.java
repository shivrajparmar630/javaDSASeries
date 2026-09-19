package arraysBasic.arrayDSA;

public class swapAlternateElement {
    static int[] swapElement(int[] arr){
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length-1; i+=2){
            int temp = arr[i];
            arr[i]= arr[i+1];
            arr[i+1] = temp;
            newArr[i] = arr[i];
            newArr[i+1]=arr[i+1];
        }
        return newArr;
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = swapElement(arr);
        for(int ele : newArr){
            System.out.print(ele+" ");
        }
    }
}

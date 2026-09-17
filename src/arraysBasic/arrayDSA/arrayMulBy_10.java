package arraysBasic.arrayDSA;

public class arrayMulBy_10 {
    static int[] multiplyBy_10(int[] arr){
        int size = arr.length;
        int newArr[] = new int[size];
        for(int i=0; i<arr.length; i++){
            int num = arr[i];
            int newNum = num*10;
            newArr[i] = newNum;
        }
        return newArr;

    }

    static void main() {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int [] newArr = multiplyBy_10(arr);
        System.out.println("The elements are :");
        for(int elements : newArr){
            System.out.print(elements+", ");
        }
    }
}

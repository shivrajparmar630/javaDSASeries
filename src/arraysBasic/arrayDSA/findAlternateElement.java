package arraysBasic.arrayDSA;

public class findAlternateElement {
    static void findAternate(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            System.out.print(arr[left]+" ");
            left++;
            if(left<=right){
                System.out.print(arr[right]+" ");
                right--;
            }
        }
    }

    static void main() {
        int[] arr = {1,2,3,4,5,6};
        findAternate(arr);
    }
}

package arraysBasic.arrayDSA;

public class firstUnsortedElement {
    static int unsortedElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i+1] <= arr[i]) {
                return arr[i + 1];
            }
        }

        return -1;
    }

    static void main() {
        int[] arr = {1,2,3,5,4};
        int unsorted = unsortedElement(arr);
        System.out.println(unsorted);
    }
}

package arraysBasic.arrayDSA;

public class findIntersectionsElements {
    static void findIntersections(int[] arr, int[] arr2) {
        for (int i = 0; i < arr.length; i++) {
            boolean already = false;
            for(int k=0; k<i; k++){
                if(arr[i]== arr[k]){
                    already = true;
                    break;
                }
            }
            if(already){
                continue;
            }
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 5, 3, 2,7 };
        int[] arr2 = {3, 4,2, 7, 9, 5, 4, 6, 7};
        findIntersections(arr, arr2);

    }
}

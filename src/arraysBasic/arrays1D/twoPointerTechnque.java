package arraysBasic.arrays1D;

public class twoPointerTechnque {
    static void main() {
        int [] arr = {10,15,25,75,95,20,40,85,65,55};
        int result = 135;
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum == result){
                System.out.println(" result found "+arr[left]+" + "+arr[right]);
                break;
            } else if (result>sum) {
                left++;
            }
            else {
                right--;
            }

        }
    }
}

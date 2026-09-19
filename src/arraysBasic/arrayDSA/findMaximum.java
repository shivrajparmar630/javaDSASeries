package arraysBasic.arrayDSA;

public class findMaximum {
    static int findMax(int[] arr ){
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    static void main() {
        int [] arr = {4,6,78,8,98,101,590,36,343,475};
        int max = findMax(arr);
        System.out.println("Maximum element of the array "+max);
    }
}

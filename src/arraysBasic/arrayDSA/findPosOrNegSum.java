package arraysBasic.arrayDSA;

public class findPosOrNegSum {
    static int[] posOrNegSum(int[] arr){
        int posArr = 0;
        int negArr =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=0){
                posArr += arr[i];
            }
            else{
                negArr += arr[i];
            }
        }
        int [] newArr = {posArr,negArr};
        return newArr;
    }

    static void main() {
        int[] arr = {-1, 5, 3, -4, 9};
        int[] newArr = posOrNegSum(arr);
        for(int ele : newArr){
            System.out.print(ele+" ");
        }
    }
}

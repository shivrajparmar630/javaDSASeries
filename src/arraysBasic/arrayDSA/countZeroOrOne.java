package arraysBasic.arrayDSA;

public class countZeroOrOne {
    static  int[] countOneOrZero(int[] arr){
        int zero = 0;
        int one = 0;
        for(int i : arr){
            if(i==0){
                zero++;
            }
            if (i==1){
                one++;
            }
        }
       return new int[]{zero,one};
    }

    static void main() {
        int[] arr = {0,1,0,0,1,1,3,1};
        int[] newArr = countOneOrZero(arr);
        System.out.println("Zero and One is :");
        for(int ele : newArr){
            System.out.print(ele+" ");
        }
    }
}

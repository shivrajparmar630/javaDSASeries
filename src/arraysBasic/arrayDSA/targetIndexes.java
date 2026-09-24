package arraysBasic.arrayDSA;
public class targetIndexes {
        public int[] twoSum(int[] nums, int target) {
            for(int i=0; i<nums.length; i++ ){
                for(int j = i+1; j<nums.length; j++){
                    if(nums[i]+nums[j]==target){
                        return new int[]{i,j};
                    }
                }
            }
            return new int[]{0};
        }

 public void main() {
        int[] nums = {1,2,3,4,5,6,7};
        int target =  7;
        int[] arr = twoSum(nums, target);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    }


public class FindPIndx {
    public static void main(String[]args){
        int[]arr={1, 7, 3, 6, 5, 6};
        pivotIndex(arr);
    }
    public static int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }
        int mid=total/2;
        int indxmid=0;
        int slow=0;
        int fast=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(slow!=mid){
                slow+=nums[i];
            }
            if(slow==mid && fast==0){
                indxmid=i;
            }
            if(slow==mid){
                if(count<1){
                    i=i+1;
                }
                count=1;
                fast+=nums[i];

            }
            if(fast==mid){
                return nums[indxmid];
            }
        }
        return -1;
    }
}

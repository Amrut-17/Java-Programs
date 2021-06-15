class Solution {
    public void sortColors(int[] nums) {
        if(nums.length < 2){
           return ; 
        }
        int low =0;
        int high = nums.length-1;
        for(int i=low; i<=high; ){
            if(nums[i] == 0){
                int temp = nums[i];
                nums[i] = nums[low];
                nums[low] = 0;
                i += 1;
                low += 1;
            }else if(nums[i] == 2){
                int temp = nums[i];
                nums[i] = nums[high];
                nums[high] = temp;
                high -= 1;
            }else{
                i += 1;
            }
        }
    }
}

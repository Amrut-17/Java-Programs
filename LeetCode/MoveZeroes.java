class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length == 0 || nums == null) {
            return;
        }
        
        int position = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[position] = nums[i];
                position += 1;
            }
        }
        for(int i=position; i<nums.length; i++){
            nums[i] = 0;
        }
    }
}

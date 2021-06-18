class Solution {
    public boolean increasingTriplet(int[] nums) {
        int count1 =Integer.MAX_VALUE;
        int count2 = Integer.MAX_VALUE;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] <= count1){
                count1 = nums[i];
            }else if(nums[i] <= count2){
                count2 = nums[i];
            }else{
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        
        int one = nums[0];
        int two = nums[nums[0]];
        while(one != two){
            one = nums[one];
            two = nums[nums[two]];
        }
        
        two = 0;
        while(one != two){
            one = nums[one];
            two = nums[two];
        }
       
        
        return two;
    }
}

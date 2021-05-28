class Solution {
    public int singleNonDuplicate(int[] nums) {
        int low =0;
        int high = nums.length - 2;
        while(low <= high){
            int mid =  low + (high-low) / 2;
            if(nums[mid] == nums[mid^1]){
                low = mid + 1 ;
            }else{
                high = mid -1;
            }
        }
        return nums[low];
    }
}

// Binary Search :
// int the array Even index contains the start of element and odd indes is the end or lst duplicate index
// but if any single number is present in the array then the indexing will change 
//  # Observation 

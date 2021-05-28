class Solution {
    public int jump(int[] nums) {
        int maxDistance  = 0;
        int current =0;
        int jumpCount = 0;
        for(int i=0; i<nums.length-1; i++){
            maxDistance = Math.max(maxDistance, i+nums[i]);
            if(current == i){
                jumpCount += 1;
                current = maxDistance;
            }
        }
        return jumpCount;
    }
}

//  Greedy Approach 

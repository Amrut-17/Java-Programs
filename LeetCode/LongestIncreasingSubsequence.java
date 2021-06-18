
//  DP approach 
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length+1];
        int maxD = 0;
        for(int i=0; i<nums.length; i++){
            int max =0;
            for(int j=0; j<i; j++){
                if(nums[j] < nums[i]){
                    if(dp[j] > max){
                        max = dp[j];
                    }
                }
            }
            dp[i] = max+1;
            if(dp[i] > maxD){
                maxD = dp[i];
            }
        }
        return maxD;
    }
}

// best approach O(nlogn)
// public int lengthOfLIS(int[] nums) {
//     int[] tails = new int[nums.length];
//     int size = 0;
//     for (int x : nums) {
//         int i = 0, j = size;
//         while (i != j) {
//             int m = (i + j) / 2;
//             if (tails[m] < x)
//                 i = m + 1;
//             else
//                 j = m;
//         }
//         tails[i] = x;
//         if (i == size) ++size;
//     }
//     return size;
// }

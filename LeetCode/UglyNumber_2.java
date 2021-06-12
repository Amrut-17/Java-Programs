class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        int c2 = 1;
        int c3 = 1;
        int c5 = 1;
        
        for(int i=2; i<n+1; i++){
            int val2 = 2 * dp[c2];
            int val3 = 3 * dp[c3];
            int val5 = 5 * dp[c5];
            int minimum = Math.min(val2, Math.min(val3, val5));
            dp[i] = minimum;
            
            if(minimum == val2){
                c2 += 1;
            }
            if(minimum == val3){
                c3 += 1;
            }
            if(minimum == val5){
                c5 += 1;
            }
        }
        return dp[n];
    }
}

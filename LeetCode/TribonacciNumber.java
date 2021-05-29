class Solution {
    public int tribonacci(int n) {
        if(n < 2) return n;
        int zero = 0;
        int one = 1;
        int two = 1;
        int sum;
        for(int i=n; i>2; i--){
            sum = zero + one + two;
            zero =one;
            one = two;
            two = sum;
        }
        return two;
    }
}
